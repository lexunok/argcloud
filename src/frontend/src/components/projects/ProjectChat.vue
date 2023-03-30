<template>
  <div class="flex flex-col">
    <ul id="messageslist" class="overflow-y-auto overflow-x-hidden h-[20rem]">
      <li v-for="message in getMessages" :key="message.id" class="mt-2">
        <div class="w-full h-auto flex flex-row ml-2">
          <div class="mt-1">
            <img class="rounded-full container ml-3 w-10 h-auto" src="../../assets/nonimg.jpg" />
          </div>
          <div class="h-auto w-auto">
            <p class="flex h-auto text-white ml-3 w-auto">{{ message.sender }}</p>
            <div class="flex ml-1 h-auto w-auto">
              <p class="bg-white rounded-[30px] my-auto mx-auto ml-2 mr-2 p-3 break-all">
                {{message.text}}
              </p>
            </div>
          </div>
        </div>
      </li>
    </ul>
    <div class="bg-white rounded-full flex flex-row h-20 mt-8 shadow-xl">
      <div class="ml-2 my-auto">
        <label class="">
          <input type="file" name="file" class="block absolute w-0 h-0 opacity-0 -z-1" ref="file" @change="readFile">
          <span class="inline-block relative text-black transition duration-150 ease-in-out p-2 rounded-full hover:bg-slate-300 active:bg-slate-400">
            <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
              <path stroke-linecap="round" stroke-linejoin="round" d="M12 10.5v6m3-3H9m4.06-7.19l-2.12-2.12a1.5 1.5 0 00-1.061-.44H4.5A2.25 2.25 0 002.25 6v12a2.25 2.25 0 002.25 2.25h15A2.25 2.25 0 0021.75 18V9a2.25 2.25 0 00-2.25-2.25h-5.379a1.5 1.5 0 01-1.06-.44z" />
            </svg>
          </span>
        </label>
      </div>
      <div class="w-full my-auto">
        <textarea v-model="message"
                  placeholder="Введите сообщение..."
                  contenteditable="true"
                  class="focus:outline-none h-10 placeholder:italic w-full resize-none"
                  @keyup.enter="sendMessageTo()">
        </textarea>
      </div>
      <div class="mr-2 my-auto">
        <button type="button" class="transition duration-150 ease-in-out p-2 rounded-full hover:bg-slate-300 active:bg-slate-400" @click="sendMessageTo()">
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
  export default {

  }
</script>
