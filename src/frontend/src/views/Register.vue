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
  <div class="flex justify-center items-center">
    <div class="bg-violet-700 w-1/3 h-[28rem] rounded-xl flex flex-col justify-center items-center mt-12">
      <div class=" mt-4 text-white basis-1/3 font-medium text-lg">Регистрация</div>
      <div class=" basis-1/3">
        <input type="text"
               id="register-input"
               placeholder="Имя и фамилия"
               required
               class="peer validation-input"
               v-model="fullname"
               @keyup.enter="sendForm()" />
        <p class="validation-text">
          Это поле не должно быть пустым.
        </p>
      </div>
      <div class=" basis-1/3 flex flex-col">
        <div class="mx-auto">
          <input type="text"
                 id="register-input"
                 placeholder="Логин"
                 required
                 class="peer validation-input"
                 v-model="username"
                 @keyup.enter="sendForm()" />
          <p class="validation-text">
            Это поле не должно быть пустым.
          </p>
        </div>
      </div>
      <div class=" basis-1/3 flex flex-col">
        <div class="mx-auto">
          <input type="email"
                 name="email"
                 id="register-input"
                 placeholder="Почта"
                 required
                 class="peer validation-input"
                 v-model="email"
                 @keyup.enter="sendForm()" />
          <p class="validation-text" v-if="email==''">
            Это поле не должно быть пустым.
          </p>
          <p class="validation-text" v-if="email!=''">
            Введите существующий адрес электронной почты.
          </p>
        </div>
      </div>
      <div class="basis-1/3">
        <div class="flex flex-row">
          <div>
            <input :type="isFlag ? 'password' : 'text'"
                   id="register-input"
                   placeholder="Пароль"
                   required
                   minlength="3"
                   class="peer rounded h-10 w-72 indent-2 focus:outline-none focus:ring-1 focus:ring-cyan-400 disabled:ring-slate-500 focus:invalid:ring-red-600"
                   v-model="password"
                   @keyup.enter="sendForm()" />
            <p class="validation-text" v-if="password==''">
              Это поле не должно быть пустым.
            </p>
            <p class="validation-text" v-if="password!=''">
              Минимальная длина пароля: 3 символа.
            </p>
          </div>
          <button @click="clickBtn" class="transition duration-150 ease-in-out w-10 h-10 rounded
            shadow-md hover:shadow-lg
            bg-cyan-400 hover:bg-cyan-500 active:bg-cyan-600">
            <div v-if="isFlag == true" class="p-2">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-6 h-6">
                <path d="M12 15a3 3 0 100-6 3 3 0 000 6z" />
                <path fill-rule="evenodd" d="M1.323 11.447C2.811 6.976 7.028 3.75 12.001 3.75c4.97 0 9.185 3.223 10.675 7.69.12.362.12.752 0 1.113-1.487 4.471-5.705 7.697-10.677 7.697-4.97 0-9.186-3.223-10.675-7.69a1.762 1.762 0 010-1.113zM17.25 12a5.25 5.25 0 11-10.5 0 5.25 5.25 0 0110.5 0z" clip-rule="evenodd" />
              </svg>
            </div>
            <div v-if="isFlag == false" class="p-2">
              <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" fill="#6D28D9" class="w-6 h-6">
                <path d="M3.53 2.47a.75.75 0 00-1.06 1.06l18 18a.75.75 0 101.06-1.06l-18-18zM22.676 12.553a11.249 11.249 0 01-2.631 4.31l-3.099-3.099a5.25 5.25 0 00-6.71-6.71L7.759 4.577a11.217 11.217 0 014.242-.827c4.97 0 9.185 3.223 10.675 7.69.12.362.12.752 0 1.113z" />
                <path d="M15.75 12c0 .18-.013.357-.037.53l-4.244-4.243A3.75 3.75 0 0115.75 12zM12.53 15.713l-4.243-4.244a3.75 3.75 0 004.243 4.243z" />
                <path d="M6.75 12c0-.619.107-1.213.304-1.764l-3.1-3.1a11.25 11.25 0 00-2.63 4.31c-.12.362-.12.752 0 1.114 1.489 4.467 5.704 7.69 10.675 7.69 1.5 0 2.933-.294 4.242-.827l-2.477-2.477A5.25 5.25 0 016.75 12z" />
              </svg>
            </div>
          </button>
        </div>
      </div>
      <div class=" basis-1/3 mt-3">
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
        password: "",
        inputType: '',
        isFlag: true
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
      },
      clickBtn() {
        this.isFlag = !this.isFlag
      },

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

  .validation-input {
    @apply rounded h-10 w-[20.5rem] indent-2 focus:outline-none focus:ring-1 focus:ring-cyan-400 disabled:ring-slate-500 focus:invalid:ring-red-600;
  }
  .validation-text {
    @apply mt-2 invisible peer-focus:peer-invalid:visible text-pink-600 text-sm w-72 mb-1;
  }
  #register-input {
      background-color: white;
    border-color: rgb(148 163 184);
    border-style: solid;
    border-width: 1px;
    color: black;
  }
    #register-input:disabled {
      border-color: rgb(248 250 252);
      border-style: solid;
      border-width: 1px;
      color: black;
    }
    #register-input:focus {
      border-color: rgb(34 211 238);
      border-style: solid;
      border-width: 1px;
      color: black;
    }
  #register-input:focus:invalid {
    border-color: rgb(220 38 38);
    border-style: solid;
    border-width: 1px;
    color: red;
  }
</style>
