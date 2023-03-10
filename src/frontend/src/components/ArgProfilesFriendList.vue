<template>
  <v-container id="profile_friends_title">
      <v-row justify="center">
        Список друзей
      </v-row>
    </v-container>
    <v-list id="profile_friends_list">
      <v-list-item v-for="friend in friends"
                   :key="friend.username"
                   :prepend-avatar="friend.avatar"
                   :title="friend.fullname"
                   :subtitle="friend.username">
                   <v-btn @click="deleteUser(friend.username)">Удалить</v-btn>
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
              {{ this.addFriend.fullname }} {{ this.addFriend.username }}
              <v-btn @click="addUser">Добавить</v-btn>
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
import axios from 'axios'

  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data() {

      return {
        usersearch: null,
        friends: [],
        addFriend: null
      }

    },
    async created(){
      const response = await axios.get("/api/friends",{params:{username:localStorage.getItem("username")}})
      this.friends = response.data
    },
    methods: {
      async searchUser() {
        if(this.usersearch!=localStorage.getItem("username")){
        const response = await axios.get("/api/profile",{params:{username:this.usersearch}})
        this.addFriend = response.data
      }
        this.clearText()
      },
      clearText() {
        this.usersearch = ''
      },
      async addUser(){
        await axios.post("/api/friends",{user:localStorage.getItem("username"),friend:this.addFriend.username})
      },
      async deleteUser(name){
        await axios.delete("/api/friends",{data:{user:localStorage.getItem("username"),friend:name}})
      }
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
