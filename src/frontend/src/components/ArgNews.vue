<template>
  <v-app id="inspire">
    <ArgNavigation />

    <v-main>
      <div>
        <v-container>
          <v-row justify="center">
            <v-card color="red">
              <v-card-title>В РАЗРАБОТКЕ</v-card-title>
              <v-card-text>Тут должны быть новости, но как вы видете их нет. Они будут позже</v-card-text>
            </v-card>
          </v-row>
        </v-container>
      </div>
    </v-main>
  </v-app>
</template>
<script>
  import ArgNavigation from "./ArgNavigation.vue"
    export default {

    components: { ArgNavigation },
     }
</script>
