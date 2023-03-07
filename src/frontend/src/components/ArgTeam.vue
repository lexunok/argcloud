<template>
  <v-app id="inspire">
    <ArgNavigation />

    <v-main>
      <div>
        <v-row no-gutters>
          <transition>
            <ArgTeamChat />
          </transition>
        </v-row>
      </div>
    </v-main>
  </v-app>
</template>
<script>
    import ArgTeamChat from "./ArgTeamChat.vue"
    import ArgNavigation from "./ArgNavigation.vue"
    export default {
    components: { ArgTeamChat, ArgNavigation },
        data() {
          return {
                }
        }
        }
</script>
