<template>
  <v-card width="750" height="515" color="deep-purple-darken-1" id="chat">
    <v-card-title>заголовок</v-card-title>
    <v-card-subtitle>Онлайн: null</v-card-subtitle>
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
      <v-form method="post" onkeypress="if(event.keyCode == 13) return false;">
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
        }
    }
</script>
<style>
    v-divider {
        color: black;
    }
    v-text-field{
        left: 100px;
    }
    #chat {
        left: 25px;
        top: 54px;
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
