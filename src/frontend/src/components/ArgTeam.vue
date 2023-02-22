<template>
    <div>
        <v-row no-gutters>
            <transition>
              <ArgTeamChat />
            </transition>
        </v-row>
    </div>
</template>
<script>
    import ArgTeamChat from "./ArgTeamChat.vue"
  export default {
    components: { ArgTeamChat },
        data() {
          return {
                }
        }
        }
</script>
