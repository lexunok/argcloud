<template>
  <div class="flex justify-center items-center h-[30rem]">
    <div class="mx-auto flex flex-col bg-violet-700 rounded-xl h-32 w-1/3">
      <div class="mx-auto text-white mt-4 basis-1/4">Добро пожаловать</div>
      <div class="mx-auto text-white basis-1/2">Это воркспейс ARGCloud. Вопрос. ТЫ КАК СЮДА ПОПАЛ???</div>
      <div class="flex flex-row basis-1/2">
        <div class="basis-1/2"></div>
        <div class="mr-2">
          <button type="button" class="transition duration-150 ease-in-out w-auto h-8 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="$router.push('/register')">
            <div class="font-sans p-1 text-sm text-violet-700 font-medium">Регистрация</div>
          </button>
        </div>
        <div class="ml-2">
          <button type="button" class="transition duration-150 ease-in-out w-auto h-8 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="$router.push('/login')">
            <div class="font-sans p-1 text-sm text-violet-700 font-medium">Войти</div>
          </button>
        </div>
        <div class="basis-1/2"></div>
      </div>
    </div>
  </div>
</template>
<script>
  /**
    *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
    *  ��� ���������� �������������. ������ ������ ������ �� �����.
    */
export default{
}
</script>
<style>
  ::-webkit-scrollbar {
    width: 0;
  }
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
</style>
