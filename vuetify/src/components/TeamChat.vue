<template>
<ul>
  <li v-for="message in messages">
      {{ message.text }}
  </li>
</ul>
<form>
  <input type="text" v-model="this.text">
  <button type="submit" @click="postMessage">Send</button>
</form>
</template>
<script>
import "axios"
import axios from "axios";
  export default{
    data(){
        return{
            messages:null,
            text:'',
        }
    },
    created(){
        axios.get("http://localhost:8080/chat")
        .then(response => this.messages = response.data)
    },
    methods:{
        postMessage(){
            axios.post("http://localhost:8080/chat",{text:this.text})
            .then(function( response ){
                }.bind(this));
        },
    }
  }
</script>