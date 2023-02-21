<template>
    <v-card width="750" height="500" color="deep-purple-lighten-4" id="chat">
        <v-card-subtitle>Онлайн: null</v-card-subtitle>
        <v-divider></v-divider>
        <v-card-text style="height: 300px;">
            <v-list>
                <v-list-item v-for="message in messages"
                             :key="message.time"
                             :prepend-avatar="message.avatar">
                    <div>{{message.who}} {{message.time}}</div>
                    <div>{{message.message}}</div>
                </v-list-item>
            </v-list>
        </v-card-text>
        <v-divider></v-divider>
        <v-card-text class="deep-purple-lighten-1">
            <v-row>
                <v-col cols="2">
                    <v-btn icon="mdi-plus-box-outline" variation="plain"></v-btn>
                </v-col>
                <v-col cols="10">
                    <v-text-field clearable
                                  label="Введите сообщение"
                                  icon-type="file"
                                  variant="underlined"></v-text-field>
                </v-col>
            </v-row>
        </v-card-text>
        <v-card-actions></v-card-actions>
    </v-card>
</template>
<script>
    export default {
        data() {
            return {
                icon: null,
                title: 'Заголовок',
                messages: [
                    {
                        who: 'Вадим',
                        message: 'Что там с бэкендом?',
                        time: '10:00',
                        avatar: null
                    },
                    {
                        who: 'Александр',
                        message: 'Почти готов',
                        time: '10:13',
                        avatar: null
                    }
                    ]
                }
        }
        }
</script>
<style>
    #test{
        color: red;
    }
    v-divider {
        color: black;
    }
    v-text-field{
        left: 100px;
    }
    #chat {
        left: 25px;
        top: 0;
    }
</style>