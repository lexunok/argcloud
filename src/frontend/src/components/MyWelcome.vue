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
        </v-main>
    </v-app>
</template>

<script>

    export default {
        head: {
            title: "ArgCloud"
            },
        data() {
            return {
                fullname: "",
                username: ""
            }
        },
        created(){
            this.fullname = localStorage.getItem("fullname")
            this.username ="@"+ localStorage.getItem("username")
        },
        methods: {
            tap() {
                alert("NE NAZIMAT")
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
  ::-webkit-scrollbar {
    width: 0;
  }
</style>
