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
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router
