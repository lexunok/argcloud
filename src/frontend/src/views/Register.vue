<template>
  <v-app>
    <v-btn color="cyan-lighten-3" prepend-icon="mdi-chevron-left" width="150" to="/">Вернуться</v-btn>
    <v-row>
      <v-col>
        <v-spacer></v-spacer>
      </v-col>
      <v-col>
        <v-card max-width="700" id="down" max-height="800" color="white">
          <v-card-title id="title">
            <v-container>
              <v-row justify="center">
                Регистрация
              </v-row>
            </v-container>
          </v-card-title>
          <v-row>
            <v-col cols="2">
              <v-spacer></v-spacer>
            </v-col>
            <v-col cols="8">
              <v-container>
                <v-text-field v-model="fullname"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Введите имя и фамилию"
                              type="text"></v-text-field>
                <v-text-field v-model="username"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Введите имя пользователя"
                              type="text"></v-text-field>
                <v-text-field v-model="email"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Введите почту"
                              type="email"></v-text-field>
                <v-text-field v-model="password"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Введите пароль"
                              type="password"></v-text-field>
              </v-container>
            </v-col>
            <v-col cols="2">
              <v-spacer></v-spacer>
            </v-col>
          </v-row>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn id="buttons" append-icon="mdi-chevron-right" @click="sendForm">Зарегестрироваться</v-btn>
            <v-spacer></v-spacer>
          </v-card-actions>
        </v-card>
      </v-col>
      <v-col>
        <v-spacer></v-spacer>
      </v-col>
    </v-row>
  </v-app>
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
  #title {
    background-color: #9C27B0;
    color: white;
  }
  #buttons {
    background-color: #4DD0E1;
    color: white;
  }

  #down {
    top: 50px;
    border: solid;
    border-color: #9C27B0;
  }
</style>
