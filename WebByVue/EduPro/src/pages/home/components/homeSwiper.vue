<template>
   <el-carousel :interval="5000" arrow="always" style="height:800px;width:100%;margin-top:90px">
    <el-carousel-item v-for="item in list" :key="item.id" style="height:800px;width:100%">
      <img :src="item.imgUrl" alt="">
    </el-carousel-item>
  </el-carousel>
</template>

<script>
// import Swiper from 'vue-swiper'
export default {
  name: 'homeSwiper',
  data () {
    return {
      list: [ {
        'id': '1',
        'imgUrl': 'http://p6alxlphh.bkt.clouddn.com/banner1.png'
      }, {
        'id': '2',
        'imgUrl': 'http://p6alxlphh.bkt.clouddn.com/banner3.png'
      }]
    }
  }
}
</script>

<style scoped>
  .el-carousel__item img {
    height: 800px;
    margin: 0;
  }

  .el-carousel__item:nth-child(2n) {
    background-color: white
  }

  .el-carousel__item:nth-child(2n+1) {
    background-color: black
  }
</style>
