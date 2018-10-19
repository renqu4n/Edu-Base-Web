// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
Vue.prototype.$ajax = axios
// 封装通过id操作dom
Vue.prototype.$get = function (id) {
  return document.getElementById(id)
}
Vue.prototype.$ref = document
// import $ from 'jquery'
// import 'bootstrap/js/bootstrap.min.js'
// import 'bootstrap/css/bootstrap.min.css'
// QS是axios库中带的，不需要我们再npm安装一个

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
