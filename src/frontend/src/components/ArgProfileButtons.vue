<template>
  <div class="flex flex-col">
    <div class="flex flex-row">
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-800 active:bg-violet-900"
              @click="$emit('changeCard','ArgProfileFriend')">
        <div class="font-bold text-white mx-auto my-auto text-3xl">Друзья</div>
      </button>
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-900 cursor-not-allowed">
        <div class="font-bold text-white mx-auto my-auto text-3xl">Резюме</div>
      </button>
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-900 cursor-not-allowed">
        <div class="font-bold text-white mx-auto my-auto text-3xl"></div>
      </button>
    </div>
    <div class="flex flex-row">
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-900 cursor-not-allowed">
        <div class="font-bold text-white mx-auto my-auto text-3xl"></div>
      </button>
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-900 cursor-not-allowed">
        <div class="font-bold text-white mx-auto my-auto text-3xl"></div>
      </button>
      <button type="button" class="h-36 bg-violet-700 rounded-xl m-3 basis-1/3 flex
                  hover:bg-violet-900 cursor-not-allowed">
        <div class="font-bold text-white mx-auto my-auto text-3xl"></div>
      </button>
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
