<template>
    <div class="wrapper">
    <swiper :options="swiperOption" v-if="showSwiper" ref="swiper">
        <!-- slides -->
        <!-- <swiper-slide v-for="item of list" :key="item.id">
            <img class="swiper-img" :src="item.imgUrl">
        </swiper-slide>
        <div class="swiper-pagination"  slot="pagination"></div> -->
        <Slide v-for="item of list" :key="item.id">
            <img :src="item.imgUrl" alt="">
        </Slide>
        <div class="swiper-pagination"  slot="pagination"></div>
    </swiper>
    </div>
</template>

<script>
// import Swiper from 'vue-swiper'
import { Swiper, Slide } from 'vue-swiper-component'
export default {
  name: 'homeSwiper',
  data () {
    return {
      list: [{
        'id': '1',
        'imgUrl': 'http://p6alxlphh.bkt.clouddn.com/banner2.png'
      }, {
        'id': '2',
        'imgUrl': 'http://p6alxlphh.bkt.clouddn.com/banner1.png'
      }, {
        'id': '3',
        'imgUrl': 'http://p6alxlphh.bkt.clouddn.com/banner3.png'
      }],
      swiperOption: {
        pagination: '.swiper-pagination',
        loop: true
      }
    }
  },
  components: {
    Swiper,
    Slide
  },
  computed: {
    showSwiper () {
      return this.list.length
    }
  }
}
</script>

<style scoped>
.wrapper >>> .swiper-pagination-bullet-active {
    background: #fff !important;
}

.wrapper {
    width: 100%;
    overflow: hidden;
    background: #eee;
    margin-top: 90px;
}
    .swiper-img {
        width: 100%;
    }

</style>
