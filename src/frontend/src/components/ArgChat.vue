<template>
  <v-app id="inspire">
    <ArgNavigation />

    <v-main>
      <div>
        <v-row>
          <v-col cols="4">
            <v-card id="chatlist"
                    max-width="300">
              <v-toolbar color="deep-purple-darken-1">
                <v-spacer></v-spacer>
                <form><input type="text" placeholder="Поиск" /></form>
                <v-btn variant="text" icon="mdi-magnify"></v-btn>
                <v-spacer></v-spacer>
              </v-toolbar>
              <v-list lines="one">
                <v-list-item link
                             v-for="chat in chatlist"
                             :key="chat.id"
                             :title="chat.fullname"
                             :subtitle="chat.username"
                             @click="openchat(chat.id)">
                </v-list-item>
              </v-list>
            </v-card>
          </v-col>
          <v-col cols="8">
            <transition name="component-fade" mode="out-in" v-if="InChat">
              <ArgInChat :chatId="this.chatId" />
            </transition>
          </v-col>
        </v-row>
      </div>
    </v-main>
  </v-app>
</template>
<script>
import axios from "axios"
    import ArgInChat from "./ArgInChat.vue"
    import ArgNavigation from "./ArgNavigation.vue"
    export default {

        props: {
            title: String,
            icon: String
        },
        head: {
            title: "Чат"
                },
        components: { ArgInChat, ArgNavigation },
        data() {
            return {
                InChat: false,
                chatlist: [],
                chatId: 0
            }
        },
        async created(){
          const response = await axios.get("/api/friends",{params:{username:localStorage.getItem("username")}})
          this.chatlist = response.data
        },
        methods: {
            openchat(chatId) {
                if (this.InChat === false) {
                    this.chatId = chatId
                    this.InChat = true
                }
                else {
                    this.chatId = chatId
                    this.InChat = true
                }
      
            }
        }
    }
</script>
<style>
    .component-fade-enter-active,
    .component-fade-leave-active {
        transition: opacity 0.1s ease;
    }

    .component-fade-enter-from,
    .component-fade-leave-to {
        opacity: 0;
    }

    #chatlist {
        left: 200px;
        top: 54px;
    }
</style>
