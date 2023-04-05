<template>
  <div class="flex flex-col">
    <div class="grid grid-cols-2 grid-rows-2 p-2">
      <div class="settings-color-button">
        <div class="my-auto text-white">
          Стнадратный
        </div>
        <div class="place-self-end">
          <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg my-auto ml-5
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600">
            <div class="text-violet-700">ВЫБРАТЬ</div>
          </button>
        </div>
      </div>
      <div class="settings-color-button">
        <div class="my-auto text-white">
          Темный
        </div>
        <div class="place-self-end">
          <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg my-auto ml-5
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600">
            <div class="text-violet-700">ВЫБРАТЬ</div>
          </button>
        </div>
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
<style>
  #colorlist::-webkit-scrollbar {
    width: 10px;
    background-color: rgb(76 29 149);
  }

  #colorlist::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background-color: white;
  }

  #colorlist::-webkit-scrollbar-track {
    border-radius: 10px;
    background-color: rgb(76 29 149);
  }
  .settings-color-button {
    @apply flex flex-row w-auto h-auto bg-violet-700 p-3 rounded-full;
  }
</style>
