// Composables
import { createRouter, createWebHistory } from 'vue-router'

const routes = [
      {
        path: '/',
        name: 'Добро пожаловать!',
        component: () => import( '@/views/Start.vue'),
      },
      {
        path: '/register',
        name: 'Регистрация',
        component: () => import( '@/views/Register.vue'),
      },
      {
        path: '/home',
        name: 'Меню',
        component: () => import( '@/views/Home.vue'),
      },
      {
        path: '/login',
        name: 'Вход',
        component: () => import( '@/views/Login.vue'),
      },
      {
        path: '/profile',
        name: 'Профиль',
        component: () => import( '@/components/ArgProfiles.vue'),
      },
      {
        path: '/news',
        name: 'Новости',
        component: () => import( '@/components/ArgNews.vue'),
      },
      {
        path: '/chat',
        name: 'Чат',
        component: () => import( '@/components/ArgChat.vue'),
      },
      {
        path: '/files',
        name: 'Мои файлы',
        component: () => import( '@/components/ArgFiles.vue'),
      },
      {
        path: '/team',
        name: 'Команда',
        component: () => import( '@/components/ArgTeam.vue'),
      },
      {
        path: '/tools',
        name: 'Инструменты',
        component: () => import( '@/components/ArgTools.vue'),
      },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})
router.beforeEach((to, from, next) => {
  document.title = to.name;
  next();
});
export default router
