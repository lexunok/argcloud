<template>
  <div>
    <form class="flex flex-col w-[53rem] h-[30.5rem] items-center justify-center
          outline-dashed outline-2 outline-violet-700 outline-offset-[-12px] bg-cyan-400"
          id="upload-container" method="POST" action="send.php"> 
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="currentColor" class="w-6 h-6 mb-5 select-none" id="upload-image">
        <path fill-rule="evenodd" d="M12 2.25a.75.75 0 01.75.75v11.69l3.22-3.22a.75.75 0 111.06 1.06l-4.5 4.5a.75.75 0 01-1.06 0l-4.5-4.5a.75.75 0 111.06-1.06l3.22 3.22V3a.75.75 0 01.75-.75zm-9 13.5a.75.75 0 01.75.75v2.25a1.5 1.5 0 001.5 1.5h13.5a1.5 1.5 0 001.5-1.5V16.5a.75.75 0 011.5 0v2.25a3 3 0 01-3 3H5.25a3 3 0 01-3-3V16.5a.75.75 0 01.75-.75z" clip-rule="evenodd" />
      </svg>
      <div class="relative z-10">
        <input id="file-input" type="file" name="file" multiple class="w-[0.0075rem] h-[0.0075rem] opacity-0 absolute -z-10"> <!-- сам загрузчик -->
        <label for="file-input" class="font-bold cursor-pointer hover:underline">Выберите файл</label>
        <span> или перетащите его сюда</span>
      </div>
    </form>
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
</style>
