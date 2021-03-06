import Vue from 'vue'
import Router from 'vue-router'
import index from '@/pages/home/index'
import edunews from '@/pages/eduNews/news'
import edunews2 from '@/pages/eduNews/newsSecond'
import edunewsdetail from '@/pages/eduNews/newsDetail/newsDetail'
import eduabout from '@/pages/eduAbout/center'
import eduteac from '@/pages/eduRes/eduTeac/teachers'
import edureso from '@/pages/eduRes/eduReso/resour'
import eduresovideo from '@/pages/eduRes/eduReso/video/videoDetail'
import eduheart from '@/pages/eduHeart/stuHeart'
import error from '@/pages/error/error'

Vue.use(Router)

export default new Router({
  // mode: 'history',
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
      path: '/eduNews/eduNewsDetail/:newsId',
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
      path: '/eduRes/eduTeac',
      name: 'eduTeac',
      component: eduteac
    },
    {
      path: '/eduRes/eduReso',
      name: 'eduReso',
      component: edureso
    },
    {
      path: '/eduRes/eduReso/eduVideo:videoId',
      name: 'eduResoVideo',
      component: eduresovideo
    },
    // 学员心声router
    {
      path: '/eduHeart',
      name: 'eduHeart',
      component: eduheart
    },
    {
      path: '/error',
      name: 'eduError',
      component: error
    }
  ]
})
