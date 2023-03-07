<template>
  <v-app id="inspire">
    <ArgNavigation />

    <v-main>
      <div>
        <v-container>
          <v-row>
            <v-col cols="1">
              <v-avatar size="100" image="https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg"></v-avatar>
            </v-col>
            <v-col cols="11" align-self="center">
              <v-container>
                <div id="profile_username">{{fullname}}</div>
              </v-container>
            </v-col>
          </v-row>
        </v-container>
        <v-divider></v-divider>
        <ArgProfilesFriendList />
      </div>
    </v-main>
  </v-app>
</template>
<script>
  import ArgProfilesFriendList from './ArgProfilesFriendList.vue'
  import ArgNavigation from './ArgNavigation.vue'
  export default {
    components: { ArgProfilesFriendList, ArgNavigation },
    data(){
      return{
        fullname: ""
      }}
    ,
    created(){
      this.fullname = localStorage.getItem("fullname")
    }
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
