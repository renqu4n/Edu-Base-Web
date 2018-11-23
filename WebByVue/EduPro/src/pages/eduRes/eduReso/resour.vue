<template>
  <div>
    <holder></holder>
    <div class="body">
      <div class="resTitle">
                    <p>从0到1的蜕变</p>
                    <span>在XX，你只需要4个月的时间，我们承诺：达不到一线城市10w+年薪，全额退款</span>
      </div>
      <div class="webResPage">
        <div class="webTitle">
          <p>web前端课程</p>
          <div>
            <img src="http://p6alxlphh.bkt.clouddn.com/hand.png">
          </div>
          <p>The front course</p>
        </div>
        <div class="webMedia">
          <div class="videoPage" style="transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); transition-duration: 0ms; transform: translate(0px, 0px) translateZ(0px);">
            <div class="videoItem" v-for="item of courseList" :key="item.id">
              <div class="videoImg">
                <img :src="item.courseImg" alt="">
              </div>
              <a href="">
                <div class="videoInfo">
                  <p>【{{item.courseName}}】</p>
                  <div>
                    <span>{{item.courseInfo}}</span>
                    <img :src="item.coursePrice" alt="">
                  </div>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <foot></foot>
  </div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
export default {
  name: 'App',
  components: {
    holder,
    foot
  },
  data () {
    return {
      courseList: [
        {
          'id': 1,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E5%85%8D%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 2,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 3,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 4,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 5,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 6,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        },
        {
          'id': 7,
          'courseImg': 'http://p6alxlphh.bkt.clouddn.com/weblesson/1.png',
          'courseName': '淘宝商城项目课',
          'courseInfo': '淘宝商城项目实战',
          'coursePrice': 'http://p6alxlphh.bkt.clouddn.com/study/%E4%BB%98%E8%B4%B9%E5%AD%A6%E4%B9%A0.png'
        }
      ]
    }
  }
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
}
img {
vertical-align:middle;
border: 0;
}
 .body {
        height:2265px;
        width: 100%;
        min-width: 1903px;
        font-family: "Helvetica Neue",Helvetica,Arial,sans-serif;
    }
    .resTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                margin-top: 190px;
                text-align: center;
                font-size: 60px;
            }
            .resTitle span {
                font-size: 20px;
                color: #666;
            }
            .resTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
        .webResPage {
          margin-top: 100px;
          width: 100%;
          height: 700px;
        }
          .webTitle {
            width: 100%;
            height:167px;
            text-align: center;
          }
            .webTitle p:nth-child(1) {
              color: #222;
              font-size: 40px;
              margin-bottom: 0;
            }
            .webTitle p:nth-child(3) {
              color: #666;
              font-size: 20px;
              margin-bottom: 0;
              font-family: STX;
            }
            .webTitle div {
              background: url(http://p6alxlphh.bkt.clouddn.com/handdrag-line.png) no-repeat 50% 0 / contain;
              width: 100%;
              height: 2px;
              margin: 40px 0 35px;
              position: relative;
            }
            .webTitle div img {
              position: absolute;
              width: 32px;
              height: 34px;
              top: -15px;
              animation: handMove 4s linear infinite both;
            }
            @keyframes handMove {
              0% {
                  transform: translateX(-40px);
              }
              50% {
                  transform: translateX(40px);
              }
              100% {
                  transform: translateX(-40px);
              }
            }
            .webMedia {
              width: 100%;
              height:490px;
              margin-top: 60px;
              position: relative;
              overflow: hidden;
              padding-left: 117px;
              cursor: pointer;
            }
              .videoPage {
                    white-space: nowrap;
                    position: relative;
                    padding-right: 20px;
                    width: 4167px;
                    height: 490px;
                    padding: 5px 0;
              }
                .videoItem {
                  display: inline-block;
                  vertical-align: top;
                  margin-right: 36px;
                  border-radius: 10px;
                  animation: imgMove 30s linear infinite both;
                }
                @keyframes imgMove {
                  0% {
                      transform: translateX(-1000px);
                  }
                  50% {
                      transform: translateX(-100px);
                  }
                  100% {
                      transform: translateX(-1000px);
                  }
                }
                .videoItem:hover {
                  box-shadow: 2px 2px 12px #999;
                }
                  .videoImg {
                    width: 529px;
                    padding: 21px 21.5px 0;
                  }
                  .videoInfo {
                        padding: 0 21.5px;
                        width: 529px;
                        margin-top: 22px;
                        margin-bottom: 21px;
                  }
                    .videoInfo p:nth-child(1) {
                          font-size: 21px;
                          text-indent: -12px;
                          color: #222;
                    }
                    .videoInfo div {
                          position: relative;
                          color: #aaa;
                          font-size: 17px;
                          margin-top: 30px;
                    }
                    .videoInfo div span:nth-child(1) {
                          display: inline-block;
                          width: 350px;
                          white-space: normal;
                    }
                    .videoInfo div img:nth-child(2) {
                          position: absolute;
                          display: inline-block;
                          right: 0;
                          bottom: 0;
                    }
</style>
