<template>
  <div class="flex flex-col">
    <div class="bg-white ml-2 w-full rounded-full flex flex-row h-12">
      <div class="bg-violet-500 rounded-full w-full my-auto">
        <input type="text"
               placeholder="Поиск"
               class="focus:outline-none rounded-full w-full h-10 indent-2 text-white"
               v-model="search"
               @input="searchFriend()"
               @keyup.enter="searchFriend()"/>
      </div>
      <div class="mr-5 my-auto">
        <button type="button" @click="searchFriend()" class="transition duration-150 ease-in-out rounded-full w-8 h-8  hover:bg-slate-300 active:bg-slate-400">
          <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6 mx-auto">
            <path stroke-linecap="round" stroke-linejoin="round" d="M21 21l-5.197-5.197m0 0A7.5 7.5 0 105.196 5.196a7.5 7.5 0 0010.607 10.607z" />
          </svg>
        </button>
      </div>
    </div>
    <div class="" v-if="search==''">
      <ul class="overflow-y-auto overflow-x-hidden h-[15rem]">
        <li v-for="friend in getFriends">
          <div class="flex flex-row h-auto mt-1 ml-2">
            <div class="my-auto">
              <img class="rounded-full container w-10 h-10" src="../assets/nonimg.jpg" />
            </div>
            <div class="ml-4 my-auto w-full overflow-hidden">
              <div>{{friend.fullname}}</div>
              <div>@{{ friend.username }}</div>
            </div>
            <div class="my-auto mr-2 mx-auto">
              <button type="button" class="transition duration-150 ease-in-out w-8 h-8 rounded-lg
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="deleteFriend({username: getUsername,friendname:friend.username})">
                <div class="">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-8 h-8">
                    <path fill-rule="evenodd" d="M12 2.25c-5.385 0-9.75 4.365-9.75 9.75s4.365 9.75 9.75 9.75 9.75-4.365 9.75-9.75S17.385 2.25 12 2.25zm-1.72 6.97a.75.75 0 10-1.06 1.06L10.94 12l-1.72 1.72a.75.75 0 101.06 1.06L12 13.06l1.72 1.72a.75.75 0 101.06-1.06L13.06 12l1.72-1.72a.75.75 0 10-1.06-1.06L12 10.94l-1.72-1.72z" clip-rule="evenodd" />
                  </svg>
                </div>
              </button>
            </div>
          </div>
        </li>
      </ul>
    </div>
    <div class="" v-if="this.searchuser">
      <div class="overflow-y-auto overflow-x-hidden h-[15rem]">
        <div class="flex flex-row h-auto mt-1 ml-2" >
          <div class="my-auto ">
            <img class="rounded-full container w-10 h-10" src="../assets/nonimg.jpg" />
          </div>
          <div class="ml-4 my-auto w-full overflow-hidden">
            <div>{{unknownuser.fullname}}</div>
            <div>@{{ unknownuser.username }}</div>
          </div>
          <div class="my-auto mr-2">
            <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="addFriend({username: getUsername,friendname:unknownuser.username}) ">
              <div class="flex flex-row">
                <div class="font-sans ml-2.5 text-sm text-violet-700 font-medium">ДОБАВИТЬ</div>
                <div class="ml-5">
                  <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-5 h-5">
                    <path d="M6.25 6.375a4.125 4.125 0 118.25 0 4.125 4.125 0 01-8.25 0zM3.25 19.125a7.125 7.125 0 0114.25 0v.003l-.001.119a.75.75 0 01-.363.63 13.067 13.067 0 01-6.761 1.873c-2.472 0-4.786-.684-6.76-1.873a.75.75 0 01-.364-.63l-.001-.122zM19.75 7.5a.75.75 0 00-1.5 0v2.25H16a.75.75 0 000 1.5h2.25v2.25a.75.75 0 001.5 0v-2.25H22a.75.75 0 000-1.5h-2.25V7.5z" />
                  </svg>
                </div>
              </div>
            </button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios'
import { mapGetters,mapActions } from 'vuex'
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data(){
      return {
        search: '',
        searchuser:  false,
        unknownuser: null,
      }
    },
    computed: {...mapGetters(['getFriends','getUsername'])},
    methods: {
      ...mapActions(['addFriend','deleteFriend']),
      async searchFriend() {
        try{const response = await axios.get("/api/profile", { params: { username: this.search } })
            if(this.search!=''&& this.search!=this.getUsername && this.getFriends.find((i) => i.username === this.search) == undefined){
              this.unknownuser = response.data
              this.searchuser = true
            }
        }catch (e){
          this.searchuser = false
          this.unknownuser = null
        }
        }
      },
      changeDelete(){
        this.delete = !this.delete
      },
    } 
  
</script>
<style>
</style>
