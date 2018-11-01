<template>
<div style="" id="fullScreen">
    <holder style="position:absolute;z-index:2;"></holder>

    <div class="body">
      <swiper style="position:absolute;z-index:1;"></swiper>
      <student></student>
    </div>
    <foot></foot>
</div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import swiper from './components/homeSwiper'
import student from './components/greatStu'
export default {
  name: 'index',
  data () {
    return {
    }
  },
  components: {
    holder,
    foot,
    swiper,
    student
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
  height: 3000px;
  width: 100%;
  position: flex;
}

</style>
