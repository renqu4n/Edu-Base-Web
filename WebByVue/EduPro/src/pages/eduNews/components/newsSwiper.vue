<template>
    <div class="wrapper">
    <swiper :options="swiperOption" v-if="showSwiper" ref="swiper">
        <!-- slides -->
        <!-- <swiper-slide v-for="item of list" :key="item.id">
            <img class="swiper-img" :src="item.imgUrl">
        </swiper-slide>
        <div class="swiper-pagination"  slot="pagination"></div> -->
        <Slide v-for="item of list" :key="item.id">
            <img :src="item.imgUrl" class="swiperImg" alt="">
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
        'imgUrl': 'http://www.neea.edu.cn/res/Home/page/18044570.jpg'
      }, {
        'id': '2',
        'imgUrl': 'http://www.neea.edu.cn/res/Home/node/16070225.jpg'
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
* {
  margin: 0;
  padding: 0;
}
.wrapper >>> .swiper-pagination-bullet-active {
    background: #fff !important;
}

.wrapper {
    width: 100%;
    overflow: hidden;
    background: #eee;
    margin-top: 90px;
}
    .swiperImg {
        width: 100%;
        height: 500px;
    }

</style>
