<template>
  <v-app id="inspire">
    <v-navigation-drawer expand-on-hover
                         class="pt-4"
                         color="grey-lighten-3"
                         rail>
      <v-list>
        <v-list-item link
                     prepend-avatar="https://lezgigazet.ru/wp-content/uploads/2020/11/nonimg.jpg"
                     :title="fullname"
                     :subtitle="username"
                     to="/profile">
        </v-list-item>
      </v-list>
      <v-divider></v-divider>
      <v-list density="compact"
              nav>
        <v-list-item link
                     prepend-icon="mdi-newspaper"
                     title="Новости"
                     to="/news">
        </v-list-item>
        <v-list-item link
                     prepend-icon="mdi-account-group"
                     to="/team"
                     title="Команда">
          <template v-slot:append>
            <v-badge color="info"
                     content="1"
                     inline>
            </v-badge>
          </template>
        </v-list-item>
        <v-list-item link
                     to="/chat"
                     prepend-icon="mdi-forum"
                     title="Чат">
          <template v-slot:append>
            <v-badge color="error"
                     content="31"
                     inline>
            </v-badge>
          </template>
        </v-list-item>

        <v-list-item link
                     @click="view = 'ArgFiles'"
                     prepend-icon="mdi-folder"
                     title="Мои файлы"
                     to="/files">
        </v-list-item>
        <v-list-item link
                     prepend-icon="mdi-hammer-screwdriver"
                     title="Инструменты"
                     to="/tools">
        </v-list-item>
        <v-list-item link
                     prepend-icon="mdi-exit-to-app"
                     title="Выйти"
                     to="/">
        </v-list-item>
      </v-list>
    </v-navigation-drawer>

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
                             :key="chat.title"
                             :title="chat.title"
                             :prepend-avatar="chat.icon"
                             @click="openchat">
                </v-list-item>
              </v-list>
            </v-card>
          </v-col>
          <v-col cols="8">
            <transition name="component-fade" mode="out-in" v-if="InChat">
              <ArgInChat />
            </transition>
          </v-col>
        </v-row>
      </div>
    </v-main>
  </v-app>
</template>
<script>
    import ArgInChat from "./ArgInChat.vue"
    export default {

        props: {
            title: String,
            icon: String
        },
        head: {
            title: "Чат"
                },
        components: { ArgInChat },
        data() {
            return {
                InChat: false,
                chatlist: [
                    {
                        title: 'Рабочий чат',
                        icon: 'https://kartinkin.net/uploads/posts/2022-03/1647874291_22-kartinkin-net-p-rabochee-mesto-kartinki-24.jpg',
                        id: 1
                    },
                    {
                        title: 'Александр',
                        icon: null,
                        id: 2
                    }
                ]
            }
        },
        methods: {
            openchat() {
                if (this.InChat === false) {
                    this.InChat = true
                }
                else {
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
