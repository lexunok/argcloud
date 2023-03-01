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
                <v-text-field v-model="email"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Почта"
                              type="email"
                              @click:append="sendEmail"
                              @click:clear="clearEmail"></v-text-field>
                <v-text-field v-model="password"
                              variant="outlined"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Пароль"
                              type="password"
                              @click:append="sendPassword"
                              @click:clear="clearPassword"></v-text-field>
              </v-container>
            </v-col>
            <v-col cols="2">
              <v-spacer></v-spacer>
            </v-col>
          </v-row>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn id="buttons" append-icon="mdi-chevron-right" to="/home">Войти</v-btn>
            <v-btn id="buttons" append-icon="mdi-close-circle-outline" @click="clearForm">Очистить</v-btn>
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
  /**
    *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
    *  ��� ���������� �������������. ������ ������ ������ �� �����.
    */
  export default {
    data() {
      return {
        username: null,
        email: null,
        password: null
      }
    },
    methods: {
      sendEmail() {
        this.clearEmail()
      },
      sendPassword() {
        this.clearPassword()
      },
      clearEmail() {
        this.email = ''
      },
      clearPassword() {
        this.password = ''
      },
      sendForm() {
        this.clearForm()
      },
      clearForm() {
        this.clearEmail()
        this.clearPassword()
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
