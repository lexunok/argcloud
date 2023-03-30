<template>
  <div class="pl-10 pr-10 pt-16 pb-16 rounded-r-[20px] w-full h-full flex flex-col">
    <div class="pt-8 pb-8 pr-5 pl-5 bg-violet-700 rounded-[20px] w-full h-[30rem]" v-if="getBoolSelectProject" >
      <About />
      <div class="flex pt-20">
        <button type="button" class="transition duration-150 ease-in-out w-auto h-auto rounded
            shadow-md hover:shadow-lg mx-auto
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
                @click="">
          <div class="flex flex-row p-2">
            <div class="font-sans mx-auto text-sm text-violet-700 font-medium">Присоединиться</div>
          </div>
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
  import About from "../projects/AboutProject.vue"
  import { mapGetters } from 'vuex'
  export default {
    components: { About },
    computed: { ...mapGetters(['getBoolSelectProject']) }
  }
</script>
<style>
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 0.3s ease-in-out;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
</style>
