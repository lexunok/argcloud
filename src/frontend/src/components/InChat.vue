<template>
  <div class="flex flex-col">
    <div class="mx-auto text-white font-medium">
      {{this.getChatName}}
    </div>
    <div class="mx-auto text-white">
      Онлайн: null
    </div>
    <ul id="messageslist" class="overflow-y-auto overflow-x-hidden h-[26rem]">
      <li v-for="message in getMessages" :key="message.id" class="mt-2">
        <div class="w-auto h-auto flex flex-row ml-2">
          <div class="mt-1">
            <img class="rounded-full container ml-3 w-10 h-auto" src="../assets/nonimg.jpg" />
          </div>
          <div class="ml-3 container bg-white rounded-[30px] h-auto w-auto">
            <div class=" my-auto mx-auto ml-2 mr-2 p-3 break-all">
              {{message.text}}
            </div>
          </div>
        </div>
      </li>
    </ul>
    <div class="bg-white rounded-full flex flex-row h-20 mt-8 shadow-xl">
      <div class="ml-2 my-auto">
        <button type="button" class="transition duration-150 ease-in-out p-2 rounded-full hover:bg-slate-300 active:bg-slate-400">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
            <path stroke-linecap="round" stroke-linejoin="round" d="M12 10.5v6m3-3H9m4.06-7.19l-2.12-2.12a1.5 1.5 0 00-1.061-.44H4.5A2.25 2.25 0 002.25 6v12a2.25 2.25 0 002.25 2.25h15A2.25 2.25 0 0021.75 18V9a2.25 2.25 0 00-2.25-2.25h-5.379a1.5 1.5 0 01-1.06-.44z" />
          </svg>
        </button>
      </div>
      <div class="w-full my-auto">
        <input type="text"
               v-model="message"
               placeholder="Введите сообщение..."
               class="focus:outline-none rounded-[30px] h-10 indent-2 placeholder:italic w-full"
               @keyup.enter="sendMessageTo()" />
      </div>
      <div class="mr-2 my-auto">
        <button type="button" class="transition duration-150 ease-in-out p-2 rounded-full hover:bg-slate-300 active:bg-slate-400" @click="sendMessage()">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
            <path stroke-linecap="round" stroke-linejoin="round" d="M6 12L3.269 3.126A59.768 59.768 0 0121.485 12 59.77 59.77 0 013.27 20.876L5.999 12zm0 0h7.5" />
          </svg>
        </button>
      </div>
    </div>
  </div>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  import { mapGetters, mapActions } from 'vuex'
  export default {
    data() {
      return {
        message: null,
      }
    },
    computed: {...mapGetters(['getMessages','getChatName'])},
    methods: {
      ...mapActions(['sendMessage']),
      async sendMessageTo() {
        this.sendMessage(this.message)
        this.message = ''
      },
    }
  }
</script>
<style>
  #messageslist::-webkit-scrollbar {
    width: 10px;
    background-color: #6D28D9;
  }

  #messageslist::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background-color: white;
  }

  #messageslist::-webkit-scrollbar-track {
    border-radius: 10px;
    background-color: #6D28D9;
  }
</style>
