<template>
  <v-container>
    <v-row>
      <v-col cols="6">
        <v-container id="profiles_news">

        </v-container>
      </v-col>
      <v-col cols="1"><v-spacer></v-spacer></v-col>
      <v-col cols="5">
        <v-container id="profiles_friends">
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
        </v-container>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
  /**
  *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
  *  ��� ���������� �������������. ������ ������ ������ �� �����.
  */
  export default {
    data() {

      return {
        friends: [

          {
            avatar: 'https://sun9-20.userapi.com/impg/8D8kSUwnpPLBo4Sbwcb5FGuIviN4GA-q9d83ZQ/vqmo3qz6PTI.jpg?size=1440x1920&quality=95&sign=9cf1622a71daec5f66cd70a9e6a7188f&type=album',
            name: 'Александр Черненко'
          },
          {
            avatar: 'https://sun9-40.userapi.com/impg/BGgoHy0rCjQMKfLFT4ImCiCe9aU_UgY5J79kGQ/3y220UOG5MM.jpg?size=640x640&quality=95&sign=7838590b7f6c673625bdfd0f1208adfd&type=album',
            name: 'Овчинников Станислав'
          },
        ]
      }
    }
  }
</script>

<style>
  #profiles_friends {
    background-color: #9C27B0;
    height: 500px;
    overflow-y: auto;
  }

  #profile_friends_title {
    background-color: white;
  }

  #profile_friends_list {
    height: 435px;
  }
</style>
