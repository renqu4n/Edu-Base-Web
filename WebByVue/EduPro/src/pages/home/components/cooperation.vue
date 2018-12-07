<template>

    <div class="wrapper" >

        <div class="titleCoo">
            <p>内推合作机构👍助力学员就业</p>
            <span>Cooperation enterprise</span>
        </div>
        <div class="picCoo">
            <ul class="picTable" >
                <li v-for="item of cooList" :key="item.id" >
                    <img :src="item.cooImgUrl1" alt="" @mouseover="changeImg(item)" @mouseout="changeImg2(item)">
                    <img :src="item.cooImgUrl2" alt="" >
                </li>
            </ul>
        </div>
    </div>

</template>

<script>
// import Swiper from 'vue-swiper'
export default {
  name: 'cooperation',
  data: function () {
    return {

      cooList: [
        {
          'id': 1,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E8%85%BE%E8%AE%AF.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E8%85%BE%E8%AE%AF.png'
        }, {
          'id': 2,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E9%98%BF%E9%87%8C%E5%B7%B4%E5%B7%B4.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E9%98%BF%E9%87%8C%E5%B7%B4%E5%B7%B4.png'
        }, {
          'id': 3,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E4%BB%8A%E6%97%A5%E5%A4%B4%E6%9D%A1.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E4%BB%8A%E6%97%A5%E5%A4%B4%E6%9D%A1.png'
        }, {
          'id': 4,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E8%85%BE%E8%AE%AF%E8%AF%BE%E5%A0%82.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E8%85%BE%E8%AE%AF%E8%AF%BE%E5%A0%82.png'
        }, {
          'id': 5,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E7%BD%91%E6%98%93.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E7%BD%91%E6%98%93.png'
        }, {
          'id': 6,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E6%96%B0%E6%B5%AA.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E6%96%B0%E6%B5%AA.png'
        }, {
          'id': 7,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/58%E5%90%8C.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/58%E5%90%8C.png'
        }, {
          'id': 8,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E6%BB%B4%E6%BB%B4%E5%87%BA%E8%A1%8C.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E6%BB%B4%E6%BB%B4%E5%87%BA%E8%A1%8C.png'
        },
        {
          'id': 9,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E7%99%BE%E5%BA%A6%E4%BA%91.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E7%99%BE%E5%BA%A6%E4%BA%91.png'
        }, {
          'id': 10,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E7%BD%91%E6%98%93%E4%BA%91%E9%9F%B3%E4%B9%90.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E7%BD%91%E6%98%93%E4%BA%91%E9%9F%B3%E4%B9%90.png'
        }, {
          'id': 11,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E7%99%BE%E5%BA%A6.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E7%99%BE%E5%BA%A6.png'
        }, {
          'id': 12,
          cooImgUrl1: 'http://p6alxlphh.bkt.clouddn.com/company/e/dark/%E5%8D%8E%E4%B8%BA.png',
          cooImgUrl2: 'http://p6alxlphh.bkt.clouddn.com/company/e/light/%E5%8D%8E%E4%B8%BA.png'
        }
      ],
      flag: false,
      img1: String,
      img2: String
    }
  },
  methods: {
    changeImg (item) {
      this.img = item.cooImgUrl1
      this.img2 = item.cooImgUrl2
      item.cooImgUrl1 = this.img2
    },
    changeImg2 (item) {
      item.cooImgUrl1 = this.img
    }
  }
}
</script>

<style scoped>
* {
    margin: 0;
    padding: 0;
}
    .wrapper {
        position: absolute;
        width: 100%;
        height: 0;
        background: orange;
        top: 1880px;
        z-index: 100;
    }
        .titleCoo {
            height: 170px;
            width: 100%;
            padding-top: 130px;
            margin-bottom: 56px;
            /* background: rebeccapurple; */
            text-align: center;
            font-size: 40px;
            /* font-weight: bold; */
        }
        .titleCoo span {
            font-size: 20px;
            color:#666;
        }
            .titleCoo span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
        .picCoo {
            width: 100%;
            height: 366px;
            margin-top: 200px;
            /* background: skyblue; */
        }
            .picTable {
                margin: 0 auto;
                width: 1225px;
                height: 366px;
                left: -38px;
                /* background: lightgreen; */
                position: relative;
            }
                .picTable li {
                    position: relative;
                    background: black;
                    display: inline-block;
                    width: 290px;
                    height: 118px;
                    left: 70px;
                    overflow: hidden;
                    cursor: default;
                    border-bottom: 1px solid #f5f5f5;
                    border-right: 1px solid #f5f5f5;
                }
                /* .picTable li img {
                    transition: transform .5s;
                }
                .picTable li img:hover {
                    transform: scale(1.3,1.3);
                } */
</style>
