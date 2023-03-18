<template>
  <v-app id="inspire">
    <Navigation />

    <v-main>
      <div>
        <v-row no-gutters>
          <transition>
            <TeamChat />
          </transition>
        </v-row>
      </div>
    </v-main>
  </v-app>
</template>
<script>
  import TeamChat from "../components/TeamChat.vue"
  import Navigation from "../components/Navigation.vue"
    export default {
    components: { TeamChat, Navigation },
        data() {
          return {
                }
        }
        }
</script>
<style>
  body {
    background: linear-gradient(90deg, rgb(99 102 241), rgb(139 92 246));
  }
</style>
