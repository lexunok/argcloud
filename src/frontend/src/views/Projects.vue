<template>
  <Navigation />
  <div class="container ml-36 mt-12 w-full h-[39rem]">
    <div class="flex flex-row rounded-[20px] bg-violet-900 h-[38rem] ">
      <transition name="component-fade" mode="out-in" v-if="getBoolProjects">
        <div class="left-side">
          <component :is="leftSideView"></component>
        </div>
      </transition>
      <div class="flex flex-col justify-center items-center h-full w-full ">
        <transition name="component-fade" mode="out-in">
          <component :is="startView"></component>
        </transition>
      </div>
    </div>
  </div>
</template>
<script>
  import Start from "../components/ProjectStart.vue"
  import Navigation from "../components/Navigation.vue"
  import ProjectList from "../components/UserProjectsList.vue"
import { mapGetters } from "vuex"
    export default {
    components: { Start, Navigation, ProjectList },
        data() {
          return {
            leftSideView: 'ProjectList',
            startView: 'Start',
          }
    },
    computed: {
      ...mapGetters(['getBoolProjects'])
    },
        }
</script>
<style>
  ::-webkit-scrollbar {
    width: 0;
  }
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
  .left-side {
    @apply w-[20rem] flex flex-col bg-violet-700 rounded-l-[20px];
  }
</style>
