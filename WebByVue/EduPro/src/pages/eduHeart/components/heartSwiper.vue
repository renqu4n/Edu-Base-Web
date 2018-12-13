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
  name: 'heartSwiper',
  data () {
    return {
      list: [{
        'id': '1',
        'imgUrl': 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1542260816026&di=51915f08db2961c54bfbf004ca6004c5&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F4%2F586b090b7f42b.jpg'
      }, {
        'id': '2',
        'imgUrl': 'http://pic1.win4000.com/wallpaper/4/586b0952baadd.jpg'
      }, {
        'id': '3',
        'imgUrl': 'http://pic1.win4000.com/wallpaper/4/586b095073a28.jpg'
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
    /* margin-top: 90px; */
}
    .swiper-img {
        width: 100%;
    }

</style>
