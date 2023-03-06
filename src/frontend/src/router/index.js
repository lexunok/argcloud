// Composables
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
      {
        path: '/',
        component: () => import( '@/views/Start.vue'),
      },
      {
        path: '/register',
        component: () => import( '@/views/Register.vue'),
      },
      {
        path: '/home',
        component: () => import( '@/views/Home.vue'),
      },
      {
        path: '/login',
        component: () => import( '@/views/Login.vue'),
      },
      {
        path: '/profile',
        component: () => import( '@/components/ArgProfiles.vue'),
      },
      {
        path: '/news',
        component: () => import( '@/components/ArgNews.vue'),
      },
      {
        path: '/chat',
        component: () => import( '@/components/ArgChat.vue'),
      },
      {
        path: '/files',
        component: () => import( '@/components/ArgFiles.vue'),
      },
      {
        path: '/team',
        component: () => import( '@/components/ArgTeam.vue'),
      },
      {
        path: '/tools',
        component: () => import( '@/components/ArgTools.vue'),
      },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
