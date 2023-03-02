<template>
  <v-app>
    <v-btn color="cyan-lighten-3" prepend-icon="mdi-chevron-left" width="150" to="/">Вернуться</v-btn>
    <v-row>
      <v-col>
        <v-spacer></v-spacer>
      </v-col>
      <v-col>
        <v-card color="white" id="down" max-width="700" max-height="400">
          <v-card-title id="title">
            <v-container>
              <v-row justify="center">
                Вход
              </v-row>
            </v-container>
          </v-card-title>
          <v-row>
            <v-col cols="2">
              <v-spacer></v-spacer>
            </v-col>
            <v-col cols="8">
              <v-container>
                <v-text-field v-model="username"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Ник"
                              type="text"></v-text-field>
                <v-text-field v-model="password"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Пароль"
                              type="password"></v-text-field>
              </v-container>
            </v-col>
            <v-col cols="2">
              <v-spacer></v-spacer>
            </v-col>
          </v-row>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn id="buttons" append-icon="mdi-chevron-right" @click="sendForm">Войти</v-btn>
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
  import axios from "axios";
  export default {
    data() {
      return {
        username: "",
        password: ""
      }
    },
    methods: {
        async sendForm() {
        const data={
            username: this.username,
            password: this.password
        }
        const response = await axios.post("app/auth/login", data)
        console.log(response)
        localStorage.setItem("token",response.data.token)
        this.$router.push("/home")
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
