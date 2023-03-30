<template>
  <Navigation />
  <div class="container ml-36 mt-12 w-[80rem] h-[39rem]">
    <div class="flex flex-row rounded-[20px] bg-violet-900 h-[38rem] ">
      <transition name="component-fade" mode="out-in" v-if="getBoolProjects">
        <div class="left-side">
          <component :is="leftSideView" @changeLView="leftSideView=$event"/>
        </div>
      </transition>
      <div class="flex flex-col justify-center items-center h-full w-full ">
        <transition name="component-fade" mode="out-in">
          <component :is="startView" @changeRView="startView=$event" />
        </transition>
      </div>
    </div>
  </div>
</template>
<script>
  import Navigation from "../components/Navigation.vue"
  import ProjectList from "../components/projects/UserProjectsList.vue"
  import CreateProject from "../components/projects/CreateProject.vue"
  import Start from "../components/projects/ProjectStart.vue"
  import UserProject from "../components/projects/UserProject.vue"
  import Members from "../components/projects/ProjectMembers.vue"
import { mapActions, mapGetters } from "vuex"
    export default {
    components: { Navigation, ProjectList, CreateProject, Start, UserProject, Members},
        data() {
          return {
            leftSideView: 'ProjectList',
            startView: 'Start',
          }
    },
    computed: {
      ...mapGetters(['getBoolProjects'])
    },
    methods:{
      ...mapActions(['setProjects'])
    }
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
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 0.3s ease-in-out;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
</style>
