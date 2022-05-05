import { createRouter, createWebHistory } from 'vue-router'
import Home from '../pages/Home.vue'
import Hello from '../pages/hello/Hello.vue'
import Select from '../pages/main/Select.vue'


const routes = [
    { 
        path: '/', 
        name: 'Home',
        component: Home
    },
    { 
        path: '/hello', 
        name: 'Hello',
        component: Hello
    },
    {
        path: '/select', 
        name: 'Select',
        component: Select
    }
]


const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})

export default router

