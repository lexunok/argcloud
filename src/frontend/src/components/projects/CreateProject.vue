<template>
  <div class="w-[50rem] h-[32rem] bg-violet-700 rounded-[30px] flex flex-col justify-center items-center">
    <div class="self-start ml--2 mt-2">
      <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg my-auto ml-5
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600"
              @click="changeViewToStartProject">
        <div class="flex flex-row">
          <div class="ml-3">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="#6D28D9" class="w-5 h-5">
              <path fill-rule="evenodd" d="M12.79 5.23a.75.75 0 01-.02 1.06L8.832 10l3.938 3.71a.75.75 0 11-1.04 1.08l-4.5-4.25a.75.75 0 010-1.08l4.5-4.25a.75.75 0 011.06.02z" clip-rule="evenodd" />
            </svg>
          </div>
          <div class="font-sans ml-2.5 text-sm text-violet-700 font-medium">ВЕРНУТЬСЯ</div>
        </div>
      </button>
    </div>
    <div class="flex flex-row">
      <div class="flex flex-col">
        <div class="flex flex-row w-[20.5rem] h-24 mt-5">
          <div class="flex flex-col self-center">
            <input type="text"
                   id="create-projects-input"
                   placeholder="Название проекта"
                   required
                   class="peer rounded h-10 w-52 indent-2 focus:outline-none focus:ring-1 focus:ring-cyan-400 disabled:ring-slate-500 focus:invalid:ring-red-600"
                   v-model="projectname"
                   @keyup.enter="createUserProject" />
            <p class="mt-2 invisible peer-focus:peer-invalid:visible text-pink-600 text-sm w-60 mb-1">
              Это поле не должно быть пустым.
            </p>
          </div>
          <div class="self-center">
            <label class="">
              <input type="file" name="file" class="block absolute w-0 h-0 opacity-0 -z-1" ref="file" @change="readFile">
              <span class="inline-block relative text-black transition duration-150 ease-in-out bg-cyan-400 rounded-full hover:bg-cyan-500 active:bg-cyan-600">
                <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-20 h-20 p-2">
                  <path fill-rule="evenodd" d="M1.5 6a2.25 2.25 0 012.25-2.25h16.5A2.25 2.25 0 0122.5 6v12a2.25 2.25 0 01-2.25 2.25H3.75A2.25 2.25 0 011.5 18V6zM3 16.06V18c0 .414.336.75.75.75h16.5A.75.75 0 0021 18v-1.94l-2.69-2.689a1.5 1.5 0 00-2.12 0l-.88.879.97.97a.75.75 0 11-1.06 1.06l-5.16-5.159a1.5 1.5 0 00-2.12 0L3 16.061zm10.125-7.81a1.125 1.125 0 112.25 0 1.125 1.125 0 01-2.25 0z" clip-rule="evenodd" />
                </svg>
              </span>
            </label>
          </div>
        </div>
        <div>
          <div class="bg-white rounded">
            <textarea v-model="about"
                      placeholder="Ведите описание проекта"
                      contenteditable="true"
                      class="rounded w-[20.5rem] indent-2 focus:outline-none focus:ring-1 focus:ring-cyan-400 disabled:ring-slate-500 resize-none h-20">
        </textarea>
          </div>
          <div class="text-white text-xs h-6 flex flex-row">
            <div class="my-auto">
              <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
                <path stroke-linecap="round" stroke-linejoin="round" d="M11.25 11.25l.041-.02a.75.75 0 011.063.852l-.708 2.836a.75.75 0 001.063.853l.041-.021M21 12a9 9 0 11-18 0 9 9 0 0118 0zm-9-3.75h.008v.008H12V8.25z" />
              </svg>
            </div>
            <div class="my-auto">Это поле не обязательно</div>
          </div>
        </div>
      </div>
      <div class="flex flex-col ml-10 bg-white h-[23rem] w-[20rem] rounded-[20px]">
        <div class="bg-cyan-400 rounded-t-[20px] flex h-10">
          <div class="mx-auto my-auto text-violet-700 font-medium">
            Пригласить
          </div>
        </div>
        <div class="mt-4 p-1">
          <ul class="overflow-y-auto overflow-x-hidden h-full">
            <li v-for="friend in getFriends">
              <div class="flex flex-row h-auto mt-1">
                <div class="my-auto">
                  <img class="rounded-full container w-10 h-10" src="../../assets/nonimg.jpg" />
                </div>
                <div class="ml-4 my-auto w-full overflow-hidden">
                  <div>{{friend.fullname}}</div>
                  <div>@{{ friend.username }}</div>
                </div>
                <div>
                  <button type="button" class="transition duration-150 ease-in-out w-10 h-10 rounded
            shadow-md hover:shadow-lg my-auto
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600">
                    <div class="flex flex-row">
                      <div class="mx-auto">
                        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-6 h-6">
                          <path d="M6.25 6.375a4.125 4.125 0 118.25 0 4.125 4.125 0 01-8.25 0zM3.25 19.125a7.125 7.125 0 0114.25 0v.003l-.001.119a.75.75 0 01-.363.63 13.067 13.067 0 01-6.761 1.873c-2.472 0-4.786-.684-6.76-1.873a.75.75 0 01-.364-.63l-.001-.122zM19.75 7.5a.75.75 0 00-1.5 0v2.25H16a.75.75 0 000 1.5h2.25v2.25a.75.75 0 001.5 0v-2.25H22a.75.75 0 000-1.5h-2.25V7.5z" />
                        </svg>
                      </div>
                    </div>
                  </button>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </div>

    <div class="mt-5">
      <button type="button" class="transition duration-150 ease-in-out w-auto h-auto p-3 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="createUserProject">
        <div class="flex flex-row">
          <div class="font-sans text-sm text-violet-700 font-medium">СОЗДАТЬ</div>
        </div>
      </button>
    </div>
  </div>
</template>
<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  import { mapGetters,mapActions,mapMutations } from 'vuex';
  export default {
    data(){
        return {
          projectname: null
        }
    },
    computed: { ...mapGetters(['getFriends','getId']) },
    methods: {
      ...mapActions(['createProject']),
      ...mapMutations(['changeViewToStartProject', 'changeViewToUserProject']),
      createUserProject() {
        this.createProject({ id: this.getId, name: this.projectname })
        this.changeViewToUserProject()
      }
    }
  }
</script>
<style>
  #create-projects-input {
    background-color: white;
    border-color: rgb(148 163 184);
    border-style: solid;
    border-width: 1px;
    color: black;
  }

  #create-projects-input:disabled {
      border-color: rgb(248 250 252);
      border-style: solid;
      border-width: 1px;
      color: black;
    }

  #create-projects-input:focus {
      border-color: rgb(34 211 238);
      border-style: solid;
      border-width: 1px;
      color: black;
    }

  #create-projects-input:focus:invalid {
        border-color: rgb(220 38 38);
        border-style: solid;
        border-width: 1px;
        color: red;
      }
</style>
