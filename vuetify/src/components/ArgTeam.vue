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
                items: [
                    { type: 'divider', inset: true },
                    {
                        prependAvatar: 'https://i.playground.ru/p/6kscjXp4J7CfOtqEakoKyA.jpeg',
                        title: 'CAN',
                        subtitle: `Can you feel my heart?`,
                    },
                    { type: 'divider', inset: true },
                    {
                        prependAvatar: 'https://foni.club/uploads/posts/2023-01/1672863367_foni-club-p-oboi-gigachad-13.jpg',
                        title: 'YOU',
                        subtitle: `Can you hear the silence?`,
                    },
                    { type: 'divider', inset: true },
                    {
                        prependAvatar: 'https://avatars.dzeninfra.ru/get-zen_doc/3956088/pub_62d81d9540fe05547f2d8a1c_62d81de5c13ec83771765522/scale_1200',
                        title: 'FEEL',
                        subtitle: 'Can you see the dark?',
                    },
                    { type: 'divider', inset: true },
                    {
                        prependAvatar: 'https://www.meme-arsenal.com/memes/86e8f424d4e3378b72e672930898d415.jpg',
                        title: 'MY',
                        subtitle: 'Can you fix the broken?',
                    },
                    { type: 'divider', inset: true },
                    {
                        prependAvatar: 'https://i.pinimg.com/originals/b1/3f/48/b13f48edbb23d9e316d49e225456055a.jpg',
                        title: 'HEARTH',
                        subtitle: 'Can you feel, can you feel my heart?',
                    },
                ]
                }
        }
        }
</script>
