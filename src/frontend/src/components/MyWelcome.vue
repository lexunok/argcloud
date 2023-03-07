<template>
    <v-app id="inspire">
        <ArgNavigation />

        <v-main>
        </v-main>
    </v-app>
</template>

<script>
    import ArgNavigation from "./ArgNavigation.vue"
    export default {

      components: {ArgNavigation},
        data() {
            return {
                fullname: "",
                username: ""
            }
        },
        created(){
            this.fullname = localStorage.getItem("fullname")
            this.username ="@"+ localStorage.getItem("username")
        }


    }
</script>
<style>

    .component-fade-enter-active,
    .component-fade-leave-active {
        transition: opacity 0.1s ease;
    }

    .component-fade-enter-from,
    .component-fade-leave-to {
        opacity: 0;
    }
  ::-webkit-scrollbar {
    width: 0;
  }
</style>
