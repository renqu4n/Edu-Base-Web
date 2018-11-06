<template>
    <div class="wrapper">
        <holder></holder>
    <!-- <swiper :options="swiperOption" v-if="showSwiper" ref="swiper">
    <Slide v-for="item of list" :key="item.id">
        <img :src="item.imgUrl" alt="">
    </Slide>
    <div class="swiper-pagination"  slot="pagination"></div>
    </swiper> -->
        <foot></foot>
    </div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import { Swiper, Slide } from 'vue-swiper-component'
export default {
  name: 'eduClass',
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
      },
      components: {
        holder,
        foot,
        Swiper,
        Slide
      },
      computed: {
        showSwiper () {
          return this.list.length
        }
      }

    }
  }
}
</script>

<style scoped>

    /* .wrapper {
        height: 2000px;
        width: 100%;
    } */
    /* .wrapper >>> .swiper-pagination-bullet-active {
        background: #fff !important;
}
    .swiper-img {
        width: 100%;
    } */
</style>
