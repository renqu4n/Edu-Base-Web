<template>
  <div class="wrapper" >
      <!-- 遮罩层 -->
    <div class="rebox" v-if="flag" style="z-index:2">
        <button @click="closeOl">X</button>
        <img :src="studentObj.stuImgUrl" alt="" class="picOl">
        <p class="titleOl">{{studentObj.name}}</p>
        <p class="schoolOl">{{studentObj.school}}</p>
        <p class="companyOl">就职公司：{{studentObj.company}}</p>
        <p class="priceOl">{{studentObj.price}}
          <span style="font-size:20px">年薪</span>
        </p>
    </div>
    <!-- 正常显示层 -->
    <div class="titleStu">
        <p>优秀学员💪俱乐部</p>
        <span>部分20-40W年薪学员</span>
    </div>
    <div class="picStu">
        <ul class="picTable" >
            <li v-for="item of stuList" ref="student" :key="item.id"  >
                <a href=""></a>
                <img :src="item.stuImgUrl" alt="" @click="openOl(item)">
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
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/1.png',
          name: '刘飞翔',
          school: '哈尔滨理工大学',
          price: '40+W',
          company: '今日头条'
        }, {
          'id': 2,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/2.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 3,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/3.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 4,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/4.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 5,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/5.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 6,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/6.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 7,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/7.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 8,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/8.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 9,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/9.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 10,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/10.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 11,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/11.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }, {
          'id': 12,
          stuImgUrl: 'http://p6alxlphh.bkt.clouddn.com/duyistudent/12.png',
          name: '张三',
          school: '贵州大学',
          price: '30+W 年薪',
          company: '网易云音乐'
        }
      ],
      flag: false,
      studentObj: Object
    }
  },
  methods: {
    openOl (item) {
      this.flag = true
      this.studentObj = item
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
  z-index: 2;
}
/* 遮罩层样式 */
.rebox {
  position: absolute;
  height: 1030px;
  width: 100%;
  background: rgba(0, 0, 0, 0.7);
  opacity: 0.99;
  color: #fff;
}
  .picOl {
    position: absolute;
    left: 50%;
    top: 50%;
    height: 400px;
    width: 570px;
    margin-left: -570px;
    margin-top: -200px;
    background: #be926f;
    border: 3px solid #fff;
    border-radius:30px;
  }
  .titleOl {
    position: absolute;
    left: 55%;
    top: 45%;
    font-size: 25px;
  }
  .schoolOl {
    position: absolute;
    left: 55%;
    top: 50%;
  }
  .companyOl {
    position: absolute;
    left: 55%;
    top: 55%;
    font-size: 17px;
  }
  .priceOl {
    position: absolute;
    left: 55%;
    top: 65%;
    font-size: 40px;
  }
.rebox button {
  position: absolute;
  bottom: 100px;
  left: 49%;
  width: 50px;
  height: 50px;
  border-radius: 100%;
  border: none;
  background: rgba(0, 0, 0, 0.6);
  color: aliceblue;
  transition: transform .8s
}
.rebox button:hover {
  transform: scale(1.5,1.5);
  background: #111
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
  margin-top: 200px;
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
  margin-left: 56px;
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
