/**
 * plugins/index.js
 *
 * Automatically included in `./src/main.js`
 */

// Plugins
import { loadFonts } from './webfontloader'
import vuetify from './vuetify'
import router from '../router'
import { store } from '@/store'


export function registerPlugins (app) {
  loadFonts()
  app
    .use(store)
    .use(vuetify)
    .use(router)
}
