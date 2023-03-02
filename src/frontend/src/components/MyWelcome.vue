<template>
    <v-app id="inspire">
        <v-navigation-drawer expand-on-hover
                             class="pt-4"
                             color="grey-lighten-3"
                             rail>
            <v-list>
                <v-list-item link
                             prepend-avatar="https://sun9-72.userapi.com/impg/sSMS9MNN9xky5pcna_waJsBtW8ZnYRM9ylh4EA/DYxe5sM6rQ0.jpg?size=720x1080&quality=95&sign=c6196736bbc8530861f290e2d5901be6&type=album"
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
                           title="Новости">
              </v-list-item>
              <v-list-item link
                           prepend-icon="mdi-account-group"
                           @click="view='ArgTeam'"
                           title="Команда">
                <template v-slot:append>
                  <v-badge color="info"
                           content="1"
                           inline>
                  </v-badge>
                </template>
              </v-list-item>
              <v-list-item link
                           v-on:click="view = 'ArgChat'"
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
                           title="Мои файлы">
              </v-list-item>
              <v-list-item link
                           prepend-icon="mdi-hammer-screwdriver"
                           title="Инструменты">
              </v-list-item>
              <v-list-item link
                           prepend-icon="mdi-exit-to-app"
                           title="Выйти"
                           to="/">
              </v-list-item>
            </v-list>
        </v-navigation-drawer>

        <v-main>
            <transition name="component-fade" mode="out-in">
                <component :is="view"></component>
            </transition>
        </v-main>
    </v-app>
</template>

<script>
    /**
    *  ���� �������� ���-�� �� �� ANSII (EN), ��  ������������� ����� ������� ��������� UTF-8
    *  ��� ���������� �������������. ������ ������ ������ �� �����.
    */
    import ArgFiles from "./ArgFiles.vue"
    import ArgChat from "./ArgChat.vue"
    import ArgTeam from "./ArgTeam.vue"

    export default {
        head: {
            title: "ArgCloud"
            },
        components: { ArgFiles, ArgChat, ArgTeam },
        data() {
            return {
                view: null,
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
