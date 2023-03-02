<template>
  <v-row>
    <v-col cols="1">
      <v-spacer></v-spacer>
    </v-col>
    <v-col cols="10">
      <v-card color="deep-purple-darken-1" id="chat">
        <v-card-title id="chattitle">
          <v-container>
            <v-row justify="center">
              ЗАГОЛОВОК
            </v-row>
          </v-container>
        </v-card-title>
        <v-card-subtitle id="chattitle">
          <v-container>
            <v-row justify="center">
              Онлайн: 0
            </v-row>
          </v-container>
        </v-card-subtitle>
        <v-divider></v-divider>
        <v-row no-gutters justify="center">
          <v-card width="750" height="350" color="deep-purple-darken-2" :rounded="0" id="smslist">
            <v-list bg-color="deep-purple-darken-2">
              <v-list-items v-for="text in messages">
                <div id="chatmessage" class="rounded-xl rounded-bs-0"><p>{{text.text}}</p></div>
              </v-list-items>
            </v-list>
          </v-card>
        </v-row>
        <v-divider></v-divider>
        <v-card :rounded="0" color="deep-purple-darken-2">
          <v-container>
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
                                @click:clear="clearMessage"
                                @keyup.enter="sendMessage"></v-text-field>
                </v-card>
              </v-col>
              <v-col cols="1">
                <v-spacer></v-spacer>
              </v-col>
            </v-row>
          </v-container>
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
              scrollInvoked: 0,
               title: 'Заголовок',
               message: null,
               messages: null

            }

        },
        created() {
          axios.get("app/chat")
            .then(response => this.messages = response.data)
        },
        methods: {
          sendMessage() {
              axios.post("app/chat", { text: this.message })
                .then(function (response) {
                }.bind(this));
            this.clearMessage()
          },
          clearMessage() {
            this.message = ''
          },
          onScroll() {
            this.scrollInvoked++
          },
        }
    }
</script>
<style>
  #chattitle {
    color: white;
  }
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
  #smslist {
    overflow-y: auto;
  }
    #smslist::-webkit-scrollbar {
      width: 10px;
      background-color: #512DA8;
    }

  #smslist::-webkit-scrollbar-thumb {
    border-radius: 10px;
    background-color: white;
  }

    #smslist::-webkit-scrollbar-track {
      border-radius: 10px;
      background-color: #512DA8;
    }
</style>
