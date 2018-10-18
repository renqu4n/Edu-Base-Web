<template>
<div>
    <holder>
    </holder>
     <router-link to="/class">
        <el-button type="primary" round>点击跳转到教育课程页面！</el-button>
      </router-link>
</div>
</template>

<script>
import Vue from 'Vue'
import holder from '@/components/header/header'
import { Button } from 'element-ui'
Vue.use(Button)
export default {
  name: 'index',
  components: {
    holder
  }

}
</script>

<style>

</style>
