<template>
  <v-app>
    <v-row>
      <v-col>
        <v-spacer></v-spacer>
      </v-col>
      <v-col>
        <v-card color="white" id="down" width="500">
          <v-card-title id="title">
            <v-container>
              <v-row justify="center">
                Добро пожаловать!
              </v-row>
            </v-container>
          </v-card-title>
          <v-card-text id="text">
          <v-container>
                         <v-row justify="center">
                           Это воркспейс ARGCloud. Вопрос. ТЫ КАК СЮДА ПОПАЛ???
                         </v-row>
            </v-container>
          </v-card-text>
          <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn id="buttons" to="/register">Регистрация</v-btn>
            <v-btn id="buttons" to="/login">Войти</v-btn>
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
export default{
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
