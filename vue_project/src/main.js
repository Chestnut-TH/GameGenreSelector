import App from './App.vue'
import router from './router/router.js'
import { createApp } from 'vue'

// // createApp(App).mount('#app')
// new Vue({
//     router,
//     render: function (h) { return h(App) },
// }).$mount('#app')

createApp(App).use(router).mount('#app')