<template>
  <Navigation />
  <div class="font-sans bg-red rounded shadow-md container mx-auto w-1/2">
    <div class="p-3 text-xl font-semibold">В РАЗРАБОТКЕ</div>
    <div class="p-3">Тут должны быть инструменты, но как вы видете их нет. Они будут позже</div>
  </div>
</template>
<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  import Navigation from "../components/Navigation.vue"
  export default {

    components: { Navigation },
  }
</script>
<style>
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
</style>
