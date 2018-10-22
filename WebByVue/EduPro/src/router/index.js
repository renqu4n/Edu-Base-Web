import Vue from 'vue'
import Router from 'vue-router'
import index from '@/pages/home/index'
import educlass from '@/pages/eduClass/class'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    },
    {
      path: '/class',
      name: 'eduClass',
      component: educlass
    }
  ]
})
