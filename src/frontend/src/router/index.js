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
        path: '/login',
        name: 'Вход',
        component: () => import( '@/views/Login.vue'),
      },
      {
        path: '/profile',
        name: 'Профиль',
        component: () => import( '@/views/Profiles.vue'),
      },
      {
        path: '/news',
        name: 'Новости',
        component: () => import( '@/views/News.vue'),
      },
      {
        path: '/chat',
        name: 'Чат',
        component: () => import( '@/views/Chat.vue'),
      },
      {
        path: '/files',
        name: 'Мои файлы',
        component: () => import( '@/views/Files.vue'),
      },
      {
        path: '/team',
        name: 'Команда',
        component: () => import( '@/views/Team.vue'),
      },
      {
        path: '/tools',
        name: 'Инструменты',
        component: () => import( '@/views/Tools.vue'),
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
