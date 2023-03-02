<template>
  <v-app>
    <MyWelcome />
  </v-app>
</template>

<script>
  import axios from "axios";
import MyWelcome from "../components/MyWelcome.vue"
  export default{
    components: {MyWelcome},
    methods:{
      async created(){
          const response = await axios.get("/app/profile")
      }
    }
  }
</script>
