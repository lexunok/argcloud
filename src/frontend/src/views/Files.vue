<template>
  <Navigation /> 
  <div class="mt-10 conatiner ml-36 w-[80rem] h-[40rem] bg-violet-700 rounded-[30px] flex"> 
    <div class="p-1 w-[78rem] h-[38rem] mx-auto my-auto flex flex-row"> 
      <div class="w-[24rem] flex flex-col"> 
        <div class="p-5">
          <ul class="overflow-y-auto h-[34rem]">
            <li v-for="folder in folders">
              <button type="button" @click="openFolder" class="transition duration-150 ease-in-out w-56 h-14 ml-3 mt-2 bg-slate-50 hover:bg-slate-300 active:bg-slate-400">
                <div class="flex flex-row ml-3">
                  <div>
                    <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
                      <path stroke-linecap="round" stroke-linejoin="round" d="M2.25 12.75V12A2.25 2.25 0 014.5 9.75h15A2.25 2.25 0 0121.75 12v.75m-8.69-6.44l-2.12-2.12a1.5 1.5 0 00-1.061-.44H4.5A2.25 2.25 0 002.25 6v12a2.25 2.25 0 002.25 2.25h15A2.25 2.25 0 0021.75 18V9a2.25 2.25 0 00-2.25-2.25h-5.379a1.5 1.5 0 01-1.06-.44z" />
                    </svg>
                  </div>
                  <div class="my-auto ml-3 overflow-hidden">
                    {{folder.name}}
                  </div>
                </div>
              </button>
            </li>
          </ul>
        </div>
      </div>
      <div class="w-[73rem]  bg-violet-900 rounded-[30px]"> 
        <transition name="component-fade" mode="out-in" v-if="InFolder">
          <FileFolder />
        </transition>
      </div>
    </div>
  </div>
</template>
<script>
  import Navigation from "../components/Navigation.vue"
  import FileFolder from "../components/FileFolder.vue"
  export default {

    components: { Navigation, FileFolder },
    data() {
      return {
        InFolder: false,
        folders: [ // список папок
          {
            name: 'Мои файлы'
          },
        ],
      }
    },
    methods: { //метод открытия папки
      openFolder() {
        if (this.InFolder == false) {
          this.InFolder = !this.InFolder
        }
      }
    }
  }
</script>
<style>
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 0.1s ease;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
</style>
