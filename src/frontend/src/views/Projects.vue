<template>
  <Navigation />
  <div class="container ml-36 mt-12 w-[80rem] h-[39rem]">
    <div class="flex flex-row rounded-[20px] bg-violet-900 h-[38rem] ">
      <transition name="component-fade" mode="out-in" v-if="getBoolProjects">
        <div class="left-side">
          <div class="p-5">
            <div class="transition duration-150 ease-in-out" v-if="startView=='UserProject' || startView=='ProjectJoin'">
              <button type="button" class="transition duration-150 ease-in-out w-full h-auto rounded
            shadow-md hover:shadow-lg my-auto
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
                      @click="startView= 'Start'; leftSideView= 'ProjectList'">
                <div class="flex flex-row p-2">
                  <div class="font-sans mx-auto text-sm text-violet-700 font-medium">Вернуться к выбору проектов</div>
                </div>
              </button>
              <button type="button" class="mt-2 transition duration-150 ease-in-out w-full h-auto rounded
            shadow-md hover:shadow-lg my-auto
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
                      @click=""
                      v-if="startView=='UserProject'">
                <div class="flex flex-row p-2">
                  <div class="font-sans mx-auto text-sm text-violet-700 font-medium">Пригласить</div>
                </div>
              </button>
            </div>
          </div>
          <div>
            <component :is="leftSideView" @changeView="changeSide" />
          </div>
        </div>
      </transition>
      <div class="flex flex-col justify-center items-center h-full w-full ">
        <transition name="component-fade" mode="out-in">
          <component :is="startView" @changeView="changeSide" />
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
  import ProjectJoin from "../components/projects/ProjectJoin.vue"
  import AllProject from "../components/projects/AllProjectList.vue"
import { mapActions, mapGetters } from "vuex"
    export default {
    components: { Navigation, ProjectList, CreateProject, Start, UserProject, Members, ProjectJoin, AllProject},
        data() {
          return {
            leftSideView: 'ProjectList',
            startView: 'Start'
          }
    },
    computed: {
      ...mapGetters(['getBoolProjects'])
    },
    methods:{
      ...mapActions(['setProjects']),
      changeSide(emitPayload) {
        this.startView = emitPayload.startView
        this.leftSideView = emitPayload.leftSideView
      }
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
    @apply w-[22rem] flex flex-col bg-violet-700 rounded-l-[20px];
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
