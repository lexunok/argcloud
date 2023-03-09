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
        <v-container>
          <v-row>
            <v-col cols="7">
              <transition name="component-fade" mode="out-in">
                <v-container id="left-card">
                  <component :is="view"></component>
                </v-container>
              </transition>
            </v-col>
            <v-col cols="1"><v-spacer></v-spacer></v-col>
            <v-col cols="4">
              <v-container id="profiles_functions">
                <v-list>
                  <v-list-item>
                    <v-btn id="friends_button" block @click="view='ArgProfilesInfo'">
                      Информация
                    </v-btn>
                  </v-list-item>
                  <v-list-item>
                    <v-btn id="friends_button" block @click="view='ArgProfilesFriendList'">
                      Друзья
                    </v-btn>
                  </v-list-item>
                  <v-list-item v-if="lol">
                    <v-btn id="friends_button" block @click="lol=!lol">
                      Только попробуй тыкнуть на меня
                    </v-btn>
                  </v-list-item>
                </v-list>
              </v-container>
            </v-col>
          </v-row>
        </v-container>
      </div>
    </v-main>
  </v-app>
</template>
<script>
  import ArgProfilesFriendList from './ArgProfilesFriendList.vue'
  import ArgNavigation from './ArgNavigation.vue'
  import ArgProfilesInfo from './ArgProfilesInfo.vue'
  export default {
    components: { ArgProfilesFriendList, ArgNavigation,  ArgProfilesInfo },
    data(){
      return{
        fullname: "",
        view: 'ArgProfilesInfo',
        lol: true
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
  #left-card {
    height: 500px;
    border: solid;
    border-color: #9C27B0;
  }
  ::-webkit-scrollbar {
    width: 0;
  }
  .component-fade-enter-active,
  .component-fade-leave-active {
    transition: opacity 1s ease;
  }

  .component-fade-enter-from,
  .component-fade-leave-to {
    opacity: 0;
  }
  #profiles_functions {
    height: 500px;
    border: solid;
    border-color: #9C27B0;
    overflow-y: auto;
  }

  #friends_button {
    background-color: #00BCD4;
    padding: 10px;
  }
</style>
