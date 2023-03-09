<template>
  <v-container id="profile_friends_title">
      <v-row justify="center">
        Список друзей
      </v-row>
    </v-container>
    <v-list id="profile_friends_list">
      <v-list-item v-for="friend in friends"
                   :key="friend.name"
                   :prepend-avatar="friend.avatar"
                   :title="friend.name">
      </v-list-item>
    </v-list>
    <v-dialog transition="dialog-top-transition"
              width="auto">
      <template v-slot:activator="{ props }">
        <v-btn color="cyan"
               v-bind="props">Добавить в друзья</v-btn>
      </template>
      <template v-slot:default="{ isActive }">
        <v-card height="500" width="1000" id="usersearchcard">
          <v-container id="searchbar">
            <v-row>
              <v-col cols="1">
                <v-spacer></v-spacer>
              </v-col>
              <v-col cols="3" align-self="center">
                <div id="fstext">Добавить в друзья</div>
              </v-col>
              <v-col cols="8">
                <v-text-field v-model="usersearch"
                              append-icon="mdi-magnify"
                              variant="solo"
                              clear-icon="mdi-close-circle"
                              clearable
                              label="Введите тег/имя пользователя"
                              type="text"
                              @click:append="searchUser"
                              @click:clear="clearText"
                              @keyup.enter="searchUser"></v-text-field>
              </v-col>
            </v-row>
          </v-container>
          <v-container>
            <v-list height="280">

            </v-list>
          </v-container>
          <v-container>
            <v-row>
              <v-spacer></v-spacer>
              <v-btn variant="text"
                     @click="isActive.value = false"
                     id="closebutton">Закрыть</v-btn>
              <v-spacer></v-spacer>
            </v-row>
          </v-container>
        </v-card>
      </template>
    </v-dialog>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data() {

      return {
        usersearch: null,
        friends: [

          {
            avatar: 'https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg',
            name: 'Александр Черненко'
          },
          {
            avatar: 'https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg',
            name: 'Овчинников Станислав'
          },

        ]
      }

    },
    methods: {
      searchUser() {
        this.clearText()
      },
      clearText() {
        this.usersearch = ''
      },
    }
  }
</script>

<style>

  #profile_friends_title {
    background-color: white;
  }

  #profile_friends_list {
    height: 400px;
    overflow-y: auto;
  }
  #closebutton {
    background-color: #00BCD4;
  }
  #searchbar {
    background-color: #9C27B0;
    color: white;
  }
  #usersearchcard {
    border: solid;
    border-color: #9C27B0;
  }
  #fstext {
      font-size: 18px;
  }
</style>
