<template>
  <Navigation />
  <div class="bg-violet-700 w-full h-48 flex flex-row">
    <div class="ml-28 w-3/4 container flex flex-row my-auto mr-32">
      <div class="my-auto ml-2">
        <img class="rounded-full container ml-3 w-40 h-40" src="../assets/nonimg.jpg" />
      </div>
      <div class="flex flex-col my-auto ml-3">
        <div class="text-4xl font-bold text-white break-words min-w-0 max-w-[35rem]">{{ getFullname }}</div>
        <div class="text-4xl font-bold text-white break-words min-w-0 max-w-[35rem]">@{{ getUsername }}</div>
      </div>
      <div class="my-auto ml-10">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#38BDF8" class="w-16 h-16">
          <path d="M21.731 2.269a2.625 2.625 0 00-3.712 0l-1.157 1.157 3.712 3.712 1.157-1.157a2.625 2.625 0 000-3.712zM19.513 8.199l-3.712-3.712-12.15 12.15a5.25 5.25 0 00-1.32 2.214l-.8 2.685a.75.75 0 00.933.933l2.685-.8a5.25 5.25 0 002.214-1.32L19.513 8.2z" />
        </svg>
      </div>
    </div>
    <div class="w-1/3 my-auto ">
      <div class="w-20 h-20 bg-white rounded-xl ml-32 mb-4" v-if="logo==null">
        <div class="font-bold mx-auto mt-7">LOGO</div>
      </div>
      <div class="w-20 h-20 rounded-xl ml-32 mb-4 bg-center bg-cover bg-[url('./assets/logo.png')]" v-if="logo!=null">
      </div>
    </div>
  </div>
  <div class="ml-20 flex flex-row mt-12">
    <div class="ml-20 w-1/2 h-[26rem] bg-white rounded-[30px] overflow-hidden">
      <div class="bg-violet-700 flex flex-row">
        <div v-if="view!='ProfileButtons'" class="flex basis-1/4">
          <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg my-auto ml-5
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="view='ProfileButtons'">
            <div class="flex flex-row">
              <div class="ml-3">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="#6D28D9" class="w-5 h-5">
                  <path fill-rule="evenodd" d="M12.79 5.23a.75.75 0 01-.02 1.06L8.832 10l3.938 3.71a.75.75 0 11-1.04 1.08l-4.5-4.25a.75.75 0 010-1.08l4.5-4.25a.75.75 0 011.06.02z" clip-rule="evenodd" />
                </svg>
              </div>
              <div class="font-sans ml-2.5 text-sm text-violet-700 font-medium">ВЕРНУТЬСЯ</div>
            </div>
          </button>
        </div>
        <div class="text-white p-4 font-medium text-lg mx-auto ">Сервисы</div>
      </div>
      <div class="">
        <transition name="component-fade" mode="out-in">
          <component :is="view" @changeCard="view=$event" />
        </transition>
      </div>
    </div>
    <div class="ml-32 w-80 h-[26rem] bg-white rounded-[30px]">
      <div class="h-[26rem] bg-white rounded-[30px] overflow-hidden">
        <div class="bg-violet-700 flex">
          <div class="text-white p-4 font-medium text-lg mx-auto">Список друзей</div>
        </div>
        <div class="p-3">
          <transition name="component-fade" mode="out-in">
            <FriendList />
          </transition>
        </div>
      </div>
      </div>
    </div>
  
</template>
<script>
  import Navigation from '../components/Navigation.vue'
  import ProfileFriend from '../components/ProfileFriend.vue'
  import FriendList from '../components/FriendList.vue'
  import ProfileButtons from '../components/ProfileButtons.vue'
  import { mapGetters } from 'vuex'
  export default {
    components: { Navigation, ProfileFriend, FriendList, ProfileButtons },
    data(){
      return{
        view: 'ProfileButtons',
        logo: "./assets/logo.png",
      }
    },
    computed: {
      ...mapGetters(['getUsername','getFullname'])
    }

  }
</script>
<style>
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
  ::-webkit-scrollbar {
    width: 0;
  }
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 1s ease;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
  
</style>
