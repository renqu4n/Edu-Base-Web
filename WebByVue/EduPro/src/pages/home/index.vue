<template>
<div style="" id="fullScreen">
    <holder>
    </holder>
    <div class="body">asdasdsadsa</div>
</div>
</template>

<script>
import Vue from 'Vue'
import holder from '@/components/header/header'
import { Button } from 'element-ui'
Vue.use(Button)
export default {
  name: 'index',
  data () {
    return {
    }
  },
  components: {
    holder
  },
  methods: {
  }
}
</script>

<style>
  * {
    margin: 0;
    padding: 0;
  }
  .body{
    height: 2000px;
    width: 100%;
  }

</style>
