import Vue from 'vue'
import Router from 'vue-router'
import index from '@/pages/home/index'
import edunews from '@/pages/eduNews/news'
import edunews2 from '@/pages/eduNews/newsSecond'
import edunewsdetail from '@/pages/eduNews/newsDetail/newsDetail'
import eduabout from '@/pages/eduAbout/center'
import eduteac from '@/pages/eduRes/eduTeac/teachers'
import edureso from '@/pages/eduRes/eduReso/resour'
import eduheart from '@/pages/eduHeart/stuHeart'

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
      component: edunews
    },
    {
      path: '/eduNews2',
      name: 'eduNews2',
      component: edunews2
    },
    {
      path: '/eduNews/eduNewsDetail',
      name: 'eduNewsDetail',
      component: edunewsdetail
    },
    // 中心简介router
    {
      path: '/eduCenter',
      name: 'eduAbout',
      component: eduabout
    },
    // 教学资源相关router
    {
      path: '/res/eduTeac',
      name: 'eduTeac',
      component: eduteac
    },
    {
      path: '/res/eduReso',
      name: 'eduReso',
      component: edureso
    },
    // 学员心声router
    {
      path: '/eduHeart',
      name: 'eduHeart',
      component: eduheart
    }
  ]
})
