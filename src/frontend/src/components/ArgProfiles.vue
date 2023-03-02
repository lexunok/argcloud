<template>
  <div>
    <v-container>
      <v-row>
        <v-col cols="1">
          <v-avatar size="100" image="https://sun9-72.userapi.com/impg/sSMS9MNN9xky5pcna_waJsBtW8ZnYRM9ylh4EA/DYxe5sM6rQ0.jpg?size=720x1080&quality=95&sign=c6196736bbc8530861f290e2d5901be6&type=album"></v-avatar>
        </v-col>
        <v-col cols="11" align-self="center">
          <v-container>
            <div id="profile_username">Вадим Власов</div>
          </v-container>
        </v-col>
      </v-row>
    </v-container>
    <v-divider></v-divider>
    <ArgProfilesFriendList />
  </div>
</template>
<script>
  import ArgProfilesFriendList from './ArgProfilesFriendList.vue'
  export default {
    components: { ArgProfilesFriendList }
  }
</script>
<style>
  #profile_username{
    font-size: 20px;
  }
  #profiles_news {
    background-color: #9C27B0;
    height: 500px;
  }
</style>
