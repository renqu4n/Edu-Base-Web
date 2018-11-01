<template>
<div class="zhezhao" v-if="flag">
    <div class="wrapper" >
        <div class="titleStu">
            <p>优秀学员俱乐部</p>
            <span>部分xx-xxW年薪学员</span>
        </div>
        <div class="picStu">
            <ul class="picTable" >
                <li v-for="item of stuList" :key="item.id"  >
                    <a href=""></a>
                    <img :src="item.stuImgUrl" alt="" @click="startZhezhao">
                </li>
            </ul>
        </div>
    </div>
</div>
</template>

<script>
// import Swiper from 'vue-swiper'
export default {
  name: 'greatStu',
  data: function () {
    return {

      stuList: [
        {
          'id': 1,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/1.png'
        }, {
          'id': 2,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/2.png'
        }, {
          'id': 3,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/3.png'
        }, {
          'id': 4,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/4.png'
        }, {
          'id': 5,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/5.png'
        }, {
          'id': 6,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/6.png'
        }, {
          'id': 7,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/7.png'
        }, {
          'id': 8,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/8.png'
        }, {
          'id': 9,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/9.png'
        }, {
          'id': 10,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/10.png'
        }, {
          'id': 11,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/11.png'
        }, {
          'id': 12,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/12.png'
        }
      ],
      flag: true

    }
  },
  methods: {
    startZhezhao () {
    //   var img = document.getElementById('item.id')
      this.flag = false
      alert('aaa')
    }
  }
}
</script>

<style scoped>
* {
    margin: 0;
    padding: 0;
}
.zhezhao{
    width: 100%;
    height: 1000px;
    opacity: 50%;
}
    .wrapper {
        position: absolute;
        width: 100%;
        height: 1000px;
        background: orange;
        top: 880px;
    }
        .titleStu {
            height: 170px;
            width: 100%;
            padding-top: 130px;
            margin-bottom: 56px;
            background: rebeccapurple;
            text-align: center;
            font-size: 40px;
            /* font-weight: bold; */
        }
        .titleStu span {
            font-size: 20px;
            color:#666;
        }
            .titleStu span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
        .picStu {
            width: 100%;
            height: 674px;
            background: skyblue;
        }
            .picTable {
                margin: 0 auto;
                width: 1225px;
                height: 648px;
                background: lightgreen;
                position: relative;
            }
                .picTable li {
                    position: relative;
                    background: black;
                    display: inline-block;
                    width: 236px;
                    height: 160px;
                    margin-bottom: 56px;
                    margin-left: 70px;
                    padding-right: 0;
                    /* float: left; */
                    overflow: hidden;
                    cursor: pointer;
                    border-radius: 15px;
                }
                .picTable li img {
                    transition: transform .5s;
                }
                .picTable li img:hover {
                    transform: scale(1.3,1.3);
                }
</style>
