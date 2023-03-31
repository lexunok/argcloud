<template>
  <div class="pl-10 pr-10 rounded-r-[20px] w-full h-full flex flex-col">
    <div class="flex flex-row bg-violet-700 rounded-b-[20px] mx-auto">
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToAbout">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              ОПИСАНИЕ
            </div>
          </div>
        </button>
      </div>
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToChat">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              ЧАТ
            </div>
          </div>
        </button>
      </div>
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToDesk">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              ДОСКА
            </div>
          </div>
        </button>
      </div>
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToCalendar">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              КАЛЕНДАРЬ
            </div>
          </div>
        </button>
      </div>
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToTools">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              ИНСТРУМЕНТЫ
            </div>
          </div>
        </button>
      </div>
      <div class="p-3">
        <button type="button" class="project-button" @click="changeToNews">
          <div class="flex flex-row p-2 text-violet-700 font-medium">
            <div class="mx-auto">
              НОВОСТИ
            </div>
          </div>
        </button>
      </div>
    </div>
    <div class="mt-8 pr-5 pl-5 bg-violet-700 rounded-[20px] w-full h-[30rem]">
      <transition name="component-fade" mode="out-in">
        <component :is="getProjectView" />
      </transition>
    </div>
  </div>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
 
  import About from "../projects/AboutProject.vue"
  import Chat from "../projects/ProjectChat.vue"
  import Desk from "../projects/ProjectDesk.vue"
  import Calendar from "../projects/ProjectCalendar.vue"
  import Tools from "../projects/ProjectTools.vue"
  import News from "../projects/ProjectNews.vue"
  import {mapMutations, mapGetters } from 'vuex'
  export default {
    components: { About, Chat, Desk, Calendar, Tools, News },
    computed: {
      ...mapGetters(['getProjectView'])
    },
    methods: {
      ...mapMutations(['changeToAbout','changeToChat','changeToDesk','changeToCalendar','changeToTools','changeToNews'])
    }
  }
</script>

<style>
  .project-button {
    @apply transition duration-150 ease-in-out w-auto h-auto rounded shadow-md hover:shadow-lg my-auto bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600;
  }
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 0.3s ease-in-out;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
</style>
