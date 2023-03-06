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
        <v-row no-gutters>
          <transition>
            <ArgTeamChat />
          </transition>
        </v-row>
      </div>
    </v-main>
  </v-app>
</template>
<script>
    import ArgTeamChat from "./ArgTeamChat.vue"
  export default {
    components: { ArgTeamChat },
        data() {
          return {
                }
        }
        }
</script>
