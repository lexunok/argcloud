<template>
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
