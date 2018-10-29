<template>
<div style="" id="fullScreen">
    <holder style="position:absolute;z-index:2;"></holder>
    <swiper style="position:absolute;z-index:1;"></swiper>
    <div class="body">

    </div>
    <foot></foot>
</div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import swiper from './homeSwiper'
export default {
  name: 'index',
  data () {
    return {
    }
  },
  components: {
    holder,
    foot,
    swiper
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
.body {
  height: 2000px;
  width: 100%;
}
</style>
