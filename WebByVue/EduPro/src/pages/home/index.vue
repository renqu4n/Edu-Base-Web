<template>
<div>
    <!-- 头部 -->
    <holder style="position:absolute;z-index:3;"></holder>
    <div class="body">
      <a href="https://ke.qq.com/course/list?mt=1001&st=2004"></a><swiper style="position:absolute;z-index:1;"></swiper></a>
      <student></student>
      <cooperation></cooperation>
    </div>
    <!-- 底部 -->
    <foot></foot>
</div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import swiper from './components/homeSwiper'
import student from './components/greatStu'
import cooperation from './components/cooperation'
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
    student,
    cooperation
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
  height: 2613px;
  width: 100%;
  /* position: flex; */
}

</style>
