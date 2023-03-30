<template>
  <div>
    <button type="button" class="transition duration-150 ease-in-out w-auto h-auto rounded m-3
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
            @click="$emit('changeView',
              {
              startView: 'CreateProject',
              leftSideView: 'ProjectList'
              })">
      <div class="flex flex-row p-2 m-1">
        <div class="font-sans text-sm text-violet-700 font-medium">СОЗДАТЬ ПРОЕКТ</div>
        <div class="ml-3">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-6 h-6">
            <path fill-rule="evenodd" d="M12 3.75a.75.75 0 01.75.75v6.75h6.75a.75.75 0 010 1.5h-6.75v6.75a.75.75 0 01-1.5 0v-6.75H4.5a.75.75 0 010-1.5h6.75V4.5a.75.75 0 01.75-.75z" clip-rule="evenodd" />
          </svg>
        </div>
      </div>
    </button>
    <button type="button" class="transition duration-150 ease-in-out w-auto h-auto rounded m-3
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
            @click="$emit('changeView',
              {
              startView: 'ProjectJoin',
              leftSideView: 'AllProject'
              })">
      <div class="flex flex-row p-2 m-1">
        <div class="font-sans text-sm text-violet-700 font-medium">ПРИСОЕДИНИТЬСЯ К ПРОЕКТУ</div>
        <div class="ml-3">
          <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-6 h-6">
            <path fill-rule="evenodd" d="M8.25 6.75a3.75 3.75 0 117.5 0 3.75 3.75 0 01-7.5 0zM15.75 9.75a3 3 0 116 0 3 3 0 01-6 0zM2.25 9.75a3 3 0 116 0 3 3 0 01-6 0zM6.31 15.117A6.745 6.745 0 0112 12a6.745 6.745 0 016.709 7.498.75.75 0 01-.372.568A12.696 12.696 0 0112 21.75c-2.305 0-4.47-.612-6.337-1.684a.75.75 0 01-.372-.568 6.787 6.787 0 011.019-4.38z" clip-rule="evenodd" />
            <path d="M5.082 14.254a8.287 8.287 0 00-1.308 5.135 9.687 9.687 0 01-1.764-.44l-.115-.04a.563.563 0 01-.373-.487l-.01-.121a3.75 3.75 0 013.57-4.047zM20.226 19.389a8.287 8.287 0 00-1.308-5.135 3.75 3.75 0 013.57 4.047l-.01.121a.563.563 0 01-.373.486l-.115.04c-.567.2-1.156.349-1.764.441z" />
          </svg>
        </div>
      </div>
    </button>
  </div>
</template>
<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
    export default {
    data() {
        return {

        }
    }
    }
</script>
<style>
  
</style>
