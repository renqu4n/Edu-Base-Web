<template>
     <div class="wrapper" >
         <!-- 遮罩层 -->
        <div class="rebox" v-if="flag" style="z-index:2">
            <button @click="closeOl">点击这里测试</button>
        </div>
        <!-- 正常显示层 -->
        <div class="titleStu">
            <p>优秀学员俱乐部</p>
            <span>部分xx-xxW年薪学员</span>
        </div>
        <div class="picStu">
            <ul class="picTable" >
                <li v-for="item of stuList" ref="student" :key="item.id"  >
                    <a href=""></a>
                    <img :src="item.stuImgUrl" alt="" @click="openOl">
                </li>
            </ul>
        </div>

    </div>

</template>

<script>

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
      flag: false

    }
  },
  methods: {
    openOl () {
      alert(this.$refs.student[0])
      this.flag = true
    },
    closeOl () {
      this.flag = false
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
  top: 880px;
  z-index: 1;
}
/* 遮罩层样式 */
.rebox {
  position: absolute;
  height: 1030px;
  width: 100%;
  background: rgba(0, 0, 0, 0.5);
  opacity: 0.9;
}
.rebox button {
  position: absolute;
  left: 50%;
  top: 50%;
}
.titleStu {
  height: 170px;
  width: 100%;
  padding-top: 130px;
  margin-bottom: 56px;
  /* background: rebeccapurple; */
  text-align: center;
  font-size: 40px;
  /* font-weight: bold; */
}
.titleStu span {
  font-size: 20px;
  color: #666;
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
  /* background: lightgreen; */
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
  transition: transform 0.5s;
}
.picTable li img:hover {
  transform: scale(1.3, 1.3);
}
</style>
