<template>
  <v-app>
      <v-main>
          <MyWelcome />
          
      </v-main>
  </v-app>
</template>

<script>
    import MyWelcome from './components/MyWelcome.vue'
    

export default {
  name: 'App',

  components: {
      MyWelcome,
      
  },

  data: () => ({
    //
  }),
}
</script>
