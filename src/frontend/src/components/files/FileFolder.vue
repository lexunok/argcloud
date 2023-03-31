<template>
  <div class="p-2 flex flex-row">
    <div class="text-white my-auto ml-3 w-[38rem]"> 
      {НАЗВАНИЕ ПАПКИ}
    </div>
    <div> 
      <button type="button" @click="changeFolderView" class="transition duration-150 ease-in-out w-auto h-14 ml-3 mt-2 bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600 rounded-[10px]">
        <div class="flex flex-row mx-auto p-2">
          <div class="text-violet-700">
            Сменить вид
          </div>
          <div class="ml-1"> 
            <div v-if="getFolderView == 'Card'">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6d28d9" class="w-6 h-6">
                <path fill-rule="evenodd" d="M3 6a3 3 0 013-3h2.25a3 3 0 013 3v2.25a3 3 0 01-3 3H6a3 3 0 01-3-3V6zm9.75 0a3 3 0 013-3H18a3 3 0 013 3v2.25a3 3 0 01-3 3h-2.25a3 3 0 01-3-3V6zM3 15.75a3 3 0 013-3h2.25a3 3 0 013 3V18a3 3 0 01-3 3H6a3 3 0 01-3-3v-2.25zm9.75 0a3 3 0 013-3H18a3 3 0 013 3V18a3 3 0 01-3 3h-2.25a3 3 0 01-3-3v-2.25z" clip-rule="evenodd" />
              </svg>
            </div>
            <div v-if="getFolderView == 'List'">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6d28d9" class="w-6 h-6">
                <path fill-rule="evenodd" d="M2.625 6.75a1.125 1.125 0 112.25 0 1.125 1.125 0 01-2.25 0zm4.875 0A.75.75 0 018.25 6h12a.75.75 0 010 1.5h-12a.75.75 0 01-.75-.75zM2.625 12a1.125 1.125 0 112.25 0 1.125 1.125 0 01-2.25 0zM7.5 12a.75.75 0 01.75-.75h12a.75.75 0 010 1.5h-12A.75.75 0 017.5 12zm-4.875 5.25a1.125 1.125 0 112.25 0 1.125 1.125 0 01-2.25 0zm4.875 0a.75.75 0 01.75-.75h12a.75.75 0 010 1.5h-12a.75.75 0 01-.75-.75z" clip-rule="evenodd" />
              </svg>
            </div>
            <div v-if="getFolderView == 'Loader'">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6d28d9" class="w-6 h-6">
                <path fill-rule="evenodd" d="M19.5 21a3 3 0 003-3V9a3 3 0 00-3-3h-5.379a.75.75 0 01-.53-.22L11.47 3.66A2.25 2.25 0 009.879 3H4.5a3 3 0 00-3 3v12a3 3 0 003 3h15zm-6.75-10.5a.75.75 0 00-1.5 0v4.19l-1.72-1.72a.75.75 0 00-1.06 1.06l3 3a.75.75 0 001.06 0l3-3a.75.75 0 10-1.06-1.06l-1.72 1.72V10.5z" clip-rule="evenodd" />
              </svg>
            </div>
          </div>
        </div>
      </button>
    </div>
    <div>
      <button type="button" @click="changeToLoader" class="transition duration-150 ease-in-out w-auto h-14 ml-3 mt-2 bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600 rounded-[10px]">
        <div class="flex flex-row mx-auto p-2">
          <div class="text-violet-700">
            Загрузить
          </div>
          <div class="ml-1">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6d28d9" class="w-6 h-6">
              <path fill-rule="evenodd" d="M12 2.25a.75.75 0 01.75.75v11.69l3.22-3.22a.75.75 0 111.06 1.06l-4.5 4.5a.75.75 0 01-1.06 0l-4.5-4.5a.75.75 0 111.06-1.06l3.22 3.22V3a.75.75 0 01.75-.75zm-9 13.5a.75.75 0 01.75.75v2.25a1.5 1.5 0 001.5 1.5h13.5a1.5 1.5 0 001.5-1.5V16.5a.75.75 0 011.5 0v2.25a3 3 0 01-3 3H5.25a3 3 0 01-3-3V16.5a.75.75 0 01.75-.75z" clip-rule="evenodd" />
            </svg>
          </div>
        </div>
      </button>
    </div>
  </div>
  <div class="ml-8 p-3"> 
    <transition name="component-fade" mode="out-in"> 
      <component :is="getFolderView" />
    </transition>
  </div>
</template>
<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  import Card from './FileViewCard.vue'
  import List from './FileViewList.vue'
  import Loader from './FileViewLoader.vue'
  import {mapMutations,mapGetters } from 'vuex'
  export default {
    components: { Card, List, Loader },
    computed: {
      ...mapGetters(['getFolderView'])
    },
    methods: {
      ...mapMutations(['changeFolderView', 'changeToLoader'])
    }
  }
</script>
<style>
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 0.1s ease-in-out;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
</style>
