// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import axios from 'axios'
import VueQuillEditor from 'vue-quill-editor'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'
// 引入样式
import 'vue-easytable/libs/themes-base/index.css'
// 导入 table 和 分页组件
import {
  VTable,
  VPagination
} from 'vue-easytable'
// 注册一个全局变量，通过this.$global访问
import global_ from './components/Global'
Vue.use(ElementUI)
Vue.prototype.$global = global_
// 注册到全局
Vue.component(VTable.name, VTable)
Vue.component(VPagination.name, VPagination)
Vue.prototype.$axios = axios
// 封装通过id操作dom
Vue.prototype.$get = function (id) {
  return document.getElementById(id)
}
// import $ from 'jquery'
// import 'bootstrap/js/bootstrap.min.js'
// import 'bootstrap/css/bootstrap.min.css'
// QS是axios库中带的，不需要我们再npm安装一个

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  VueQuillEditor,
  components: { App },
  template: '<App/>'
})
