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
            avatar: 'https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg',
            name: 'Александр Черненко'
          },
          {
            avatar: 'https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg',
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
