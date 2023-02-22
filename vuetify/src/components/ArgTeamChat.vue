<template>
  <v-row>
    <v-col cols="1">
      <v-spacer></v-spacer>
    </v-col>
    <v-col cols="10">
      <v-card color="deep-purple-darken-1" id="chat">
        <v-card-title>заголовок</v-card-title>
        <v-card-subtitle>Онлайн: null</v-card-subtitle>
        <v-divider></v-divider>
        <v-row no-gutters justify="center">
          <v-card width="750" height="350" color="deep-purple-darken-2" :rounded="0">
            <v-list bg-color="deep-purple-darken-2">
              <v-list-items v-for="message in messages"
                            :key="message.time"
                            :prepend-avatar="message.avatar">
                <div id="chatmessage" class="rounded-xl rounded-bs-0"><p>{{message.who}} {{message.time}}</p><p>{{message.message}}</p></div>
              </v-list-items>
            </v-list>
          </v-card>
        </v-row>
        <v-divider></v-divider>
        <v-card :rounded="0" color="deep-purple-darken-2">
          <v-form>
            <v-row>
              <v-col cols="1">
                <v-spacer></v-spacer>
              </v-col>
              <v-col cols="10" id="textinput">
                <v-card class="rounded-lg">
                  <v-text-field v-model="message"
                                append-icon="mdi-send"
                                prepend-icon="mdi-plus-box-outline"
                                variant="underlined"
                                clear-icon="mdi-close-circle"
                                clearable
                                label="Введите сообщение"
                                type="text"
                                @click:append="sendMessage"
                                @click:clear="clearMessage"></v-text-field>
                </v-card>
              </v-col>
              <v-col cols="1">
                <v-spacer></v-spacer>
              </v-col>
            </v-row>
          </v-form>
        </v-card>
      </v-card>
    </v-col>
    <v-col cols="1">
      <v-spacer></v-spacer>
    </v-col>
  </v-row>
</template>
<script>
  import "axios"
  import axios from "axios";
    export default {
        data() {
            return {
                icon: null,
                title: 'Заголовок',
                message: null,
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

        },
        created() {
          axios.get("http://localhost:8080/chat")
            .then(response => this.messages = response.data)
        },
        methods: {
          sendMessage() {
              axios.post("http://localhost:8080/chat", { text: this.message })
                .then(function (response) {
                }.bind(this));
            this.clearMessage()
          },
          clearMessage() {
            this.message = ''
          },
        }
    }
</script>
<style>
  v-divider {
    color: black;
  }

  v-text-field {
    left: 100px;
  }


  #chatmessage {
    margin: 15px;
    padding: 5px;
    color: black;
    background: white;
  }

  #textinput {
    background: #512DA8;
    color: black;
    padding: 25px;
  }

  #textinputspace {
    color: #512DA8;
  }
</style>
