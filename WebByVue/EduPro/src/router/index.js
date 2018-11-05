import Vue from 'vue'
import Router from 'vue-router'
import index from '@/pages/home/index'
import eduNews from '@/pages/eduNews/news'
import eduAbout from '@/pages/eduAbout/center'
import eduTeac from '@/pages/eduRes/eduTeac/teachers'
import eduReso from '@/pages/eduRes/eduReso/resour'
import eduHeart from '@/pages/eduHeart/stuHeart'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'index',
      component: index
    },
    // 新闻资讯router
    {
      path: '/eduNews',
      name: 'eduNews',
      component: eduNews
    },
    // 中心简介router
    {
      path: '/eduCenter',
      name: 'eduAbout',
      component: eduAbout
    },
    // 教学资源相关router
    {
      path: '/res/eduTeac',
      name: 'eduTeac',
      component: eduTeac
    },
    {
      path: '/res/eduReso',
      name: 'eduReso',
      component: eduReso
    },
    // 学员心声router
    {
      path: '/eduHeart',
      name: 'eduHeart',
      component: eduHeart
    }
  ]
})
