<template>
    <div>
        <v-container>
            <v-row>
                <v-col v-for="n in 24"
                       :key="n"
                       cols="4">
                    <v-card height="200"
                            color="deep-purple-darken-4"
                            width="350"
                            title="*ИМЯ ФАЙЛА*"
                            subtitle="*РАЗМЕР ФАЙЛА*"
                            text="*ОПИСАНИЕ ФАЙЛА*">

                    </v-card>
                </v-col>
            </v-row>
        </v-container>
    </div>
</template>