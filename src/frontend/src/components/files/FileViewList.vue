<template>
  <ul class="m-0 overflow-y-auto h-[30.5rem]" id="folderlist">
    <li v-for="file in getFiles" class="inline-block">
      <button type="button" class="w-[50rem] h-12 bg-cyan-400 my-2 mx-4 rounded-[20px] hover:bg-cyan-500 active:bg-cyan-600" @click="">
        <div class="ml-1 flex flex-row">
          <div class="my-auto mt-1">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6d28d9" class="w-10 h-10 mx-auto">
              <path d="M5.625 1.5c-1.036 0-1.875.84-1.875 1.875v17.25c0 1.035.84 1.875 1.875 1.875h12.75c1.035 0 1.875-.84 1.875-1.875V12.75A3.75 3.75 0 0016.5 9h-1.875a1.875 1.875 0 01-1.875-1.875V5.25A3.75 3.75 0 009 1.5H5.625z" />
              <path d="M12.971 1.816A5.23 5.23 0 0114.25 5.25v1.875c0 .207.168.375.375.375H16.5a5.23 5.23 0 013.434 1.279 9.768 9.768 0 00-6.963-6.963z" />
            </svg>
          </div>
          <div class="ml-1 my-auto">
            {{file.name}}
          </div>
          <div class="ml-2 text-slate-700 text-sm my-auto">{{file.size}}</div>
        </div>
      </button>
    </li>
  </ul>
</template>
<script>
  /**
    *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
    *  ��� ���������� �������������. ������ ������ ������ �� �����.
    */
  import { mapGetters } from 'vuex';
  export default {
    computed: { ...mapGetters(['getFiles']) }
  }
</script>
<style>
  #folderlist::-webkit-scrollbar {
    width: 10px;
    background-color: rgb(76 29 149);
  }

  #folderlist::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background-color: white;
  }

  #folderlist::-webkit-scrollbar-track {
    border-radius: 10px;
    background-color: rgb(76 29 149);
  }
</style>
