<template>
  <button type="button" class="transition duration-150 ease-in-out w-36 h-9 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="$router.push('/')">
    <div class="flex flex-row">
      <div class="ml-3">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="#6D28D9" class="w-5 h-5">
          <path fill-rule="evenodd" d="M12.79 5.23a.75.75 0 01-.02 1.06L8.832 10l3.938 3.71a.75.75 0 11-1.04 1.08l-4.5-4.25a.75.75 0 010-1.08l4.5-4.25a.75.75 0 011.06.02z" clip-rule="evenodd" />
        </svg>
      </div>
      <div class="font-sans ml-2.5 text-sm text-violet-700 font-medium">ВЕРНУТЬСЯ</div>
    </div>
  </button>
  <div class="bg-violet-700 w-1/3 h-96 rounded-xl flex flex-col container mx-auto mt-12">
    <div class="mx-auto mt-2 text-white basis-1/3 font-medium text-lg mt-4">Регистрация</div>
    <div class="mx-auto basis-1/3">
      <input type="text"
             placeholder="Имя и фамилия"
             class="focus:outline-none focus:ring focus:border-cyan-400 rounded bg-white h-10 w-64 indent-2"
             v-model="fullname" />
    </div>
    <div class="mx-auto basis-1/3">
      <input type="text"
             placeholder="Логин"
             class="focus:outline-none focus:ring focus:border-cyan-400 rounded bg-white h-10 w-64 indent-2"
             v-model="username" />
    </div>
    <div class="mx-auto basis-1/3">
      <input type="text"
             placeholder="Почта"
             class="focus:outline-none focus:ring focus:border-cyan-400 rounded bg-white h-10 w-64 indent-2"
             v-model="email" />
    </div>
    <div class="mx-auto basis-1/3">
      <input type="text"
             placeholder="Пароль"
             class="focus:outline-none focus:ring focus:border-cyan-400 rounded bg-white h-10 w-64 indent-2"
             v-model="password" />
    </div>
    <div class="mx-auto basis-1/3">
      <button type="button" class="transition duration-150 ease-in-out w-auto h-9 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600" @click="sendForm">
        <div class="flex flex-row">
          <div class="font-sans ml-2.5 text-sm text-violet-700 font-medium ">Зарегистрироваться</div>
          <div class="">
            <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 20 20" fill="#6D28D9" class="w-5 h-5">
              <path fill-rule="evenodd" d="M7.21 14.77a.75.75 0 01.02-1.06L11.168 10 7.23 6.29a.75.75 0 111.04-1.08l4.5 4.25a.75.75 0 010 1.08l-4.5 4.25a.75.75 0 01-1.06-.02z" clip-rule="evenodd" />
            </svg>
          </div>
        </div>
      </button>
    </div>
  </div>
</template>
<script>
import axios from 'axios'

  /**
    *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
    *  ��� ���������� �������������. ������ ������ ������ �� �����.
    */
  export default {
    data() {
      return {
        fullname: "",
        username: "",
        email: "",
        password: ""
      }
    },
    methods: {
      async sendForm() {
        const data={
            username: this.username,
            email: this.email,
            password: this.password,
            fullname: this.fullname
        }
        const response = await axios.post("api/auth/register", data)
        this.$router.push("/login")
      },
      clearForm(){
        this.username = "",
        this.password = "",
        this.email = "",
        this.fullname = ""
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
</style>
