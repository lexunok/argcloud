<template>
  <Navigation />
  <div class="flex flex-row mt-10">
    <div class="ml-72  w-64 h-[40rem] bg-violet-700 flex flex-col">
      <div class="bg-white ml-2 w-60 rounded-full flex flex-row mt-5 ">
        <div class="">
          <input type="text"
                 placeholder="Поиск"
                 class="focus:outline-none rounded-full h-10 indent-2 " />
        </div>
        <div class="ml-6">
          <button type="button" class="search">
            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6 mx-auto">
              <path stroke-linecap="round" stroke-linejoin="round" d="M21 21l-5.197-5.197m0 0A7.5 7.5 0 105.196 5.196a7.5 7.5 0 0010.607 10.607z" />
            </svg>
          </button>
        </div>
      </div>
      <ul class="overflow-y-auto h-[34rem] mt-3" id="chatslist">
        <li v-for="friend in getFriends" :key="friend.id">
          <button type="button" @click="openchat(friend.id, friend.fullname)" class="transition duration-150 ease-in-out w-56 h-14 ml-3 mt-2 bg-slate-50 hover:bg-slate-300 active:bg-slate-400">
            <div class="flex flex-row">
              <div>
                <img class="rounded-full container ml-3 my-auto w-10 h-10" src="../assets/nonimg.jpg" />
              </div>
              <div class="my-auto ml-3 overflow-hidden">
                {{friend.fullname}}
              </div>
            </div>
          </button>
        </li>
      </ul>
    </div>
  <div class="ml-4 w-[48rem] h-[40rem] bg-violet-700 rounded-xl">
    <div class="p-4">
      <transition name="component-fade" mode="out-in" v-if="InChat">
        <InChat/>
      </transition>
    </div>
  </div>
  </div>
</template>
<script>
  import { mapGetters, mapActions } from "vuex"
  import InChat from "../components/InChat.vue"
  import Navigation from "../components/Navigation.vue"
    export default {
    computed: {...mapGetters(['getFriends','getId'])},
    components: { InChat, Navigation },
    data() {
      return {
          InChat: false,
          }
        },
    methods: {
      ...mapActions(['setMessages','setChatId']),
      async openchat(id, name) {
        const chatId = this.getId * id
        this.setMessages(chatId)
        this.$store.commit('updateChatName',name)
        if(this.InChat===false){
          this.InChat = !this.InChat
        }
      }
    }
  }
</script>
<style>
  ::-webkit-scrollbar {
    width: 0;
  }
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
    .component-fade-enter-active,
    .component-fade-leave-active {
        transition: opacity 0.1s ease;
    }

    .component-fade-enter-from,
    .component-fade-leave-to {
        opacity: 0;
    }
  .search {
    @apply transition duration-150 ease-in-out rounded-full w-8 h-8 mt-1 hover:bg-slate-300 active:bg-slate-400;
  }
  #chatslist::-webkit-scrollbar {
    width: 10px;
    background-color: #6D28D9;
  }

  #chatslist::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background-color: white;
  }

  #chatslist::-webkit-scrollbar-track {
    border-radius: 10px;
    background-color: #6D28D9;
  }

</style>
