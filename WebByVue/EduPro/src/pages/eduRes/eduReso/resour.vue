<template>
  <div>
    <holder></holder>
    <div class="body">
      <div class="resTitle">
                    <p>从0到1的蜕变🌈</p>
                    <span>在这里，你不止学到知识</span>
      </div>
      <div class="webResPage" z-index=1>
        <div class="webTitle">
          <p>web前端课程🎞️</p>
          <div>
            <img src="http://p6alxlphh.bkt.clouddn.com/hand.png">
          </div>
          <p>The front course</p>
        </div>
        <div class="webMedia">
          <div class="videoPage" ref="videoPage" style="transition-timing-function: cubic-bezier(0.1, 0.57, 0.1, 1); transition-duration: 0ms; transform: translate(0px, 0px) translateZ(0px);" >
            <div class="videoItem" v-for="item of webCourseList" :key="item.course_id">
              <a href="#" @click="toVideo(item.course_id)">
              <div class="videoImg">
                <img :src="item.course_image" alt="">
              </div>
              <!-- <router-link to="/eduRes/eduReso/eduVideo"> -->

                <div class="videoInfo" >
                  <p>【{{item.course_name}}】</p>
                  <div>
                    <span>{{item.course_description}}</span>
                    <img src="http://p6alxlphh.bkt.clouddn.com/study/%E5%85%8D%E8%B4%B9%E5%AD%A6%E4%B9%A0.png" alt="">
                  </div>
                </div>
              </a>
              <!-- </router-link> -->
            </div>
          </div>
        </div>
      </div>
      <div class="javaResPage">
        <div class="javaPort">
          <p>COMMING SOON</p>
          <p>更用心的筹备 只为了让你学到更优质的课程</p>
          <p>JAVA课程☕</p>
        </div>
        <div class="webTitle" style="margin-top:118px;">
          <p>基础练习题</p>
          <div>
            <img src="http://p6alxlphh.bkt.clouddn.com/hand.png">
          </div>
          <p>The java course</p>
        </div>
        <div class="javaMedia">
          <div class="javaMediaPage" >
            <div class="javaExerciseItem" v-for="item of javaExerciseList" :key="item.id">
              <div class="javaItemImg">
                <img :src="item.javaExerciseImg" alt="">
              </div>
              <div class="javaItemInfo">
                <a href="#" alt="这里跳转到做测试的网页">
                  <p>{{item.javaExerciseName}}</p>
                  <div class="javaItemIntro">
                    <span>{{item.javaExerciseInfo}}</span>
                  </div>
                  <div class="javaItemStar">
                    <span></span>
                    <span></span>
                    <span></span>
                    <span></span>
                  </div>
                </a>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="resContact">
        <div class="contactTitle">
                   <p>任何疑问📞️请联系我们</p>
                    <p>Counseling course</p>
                    <span></span>
        </div>
        <div class="contactWay">
          <div class="contactWayItem">
            <div class="item-wrapper">
              <div class="item-wx-photo"></div>
              <div class="item-wx-qrcode"></div>
              <div class="item-wx-detail">
                <div>帮你量身定制课程</div>
                <div>掌握高新技术</div>
              </div>
            </div>
            <p class="wayTitle">WE CHAT</p>
          </div>
          <div class="contactWayItem">
            <div class="item-wrapper">
              <div class="item-phone-photo"></div>
              <div class="item-phone-phoneNumber">
                <p class="numberP">15285776466</p>
              </div>
              <div class="item-phone-detail">
                <div>倾听你的需求</div>
                <div>帮你成为更好的自己</div>
              </div>
            </div>
            <P class="wayTitle">Phone</P>
          </div>
          <div class="contactWayItem">
            <div class="item-wrapper">
              <div class="item-qq-photo"></div>
              <div class="item-qq-online">
                <a class="item-qq-a" href="http://wpa.qq.com/msgrd?v=3&amp;uin=124797531&amp;site=qq&amp;menu=yes"></a>
              </div>
              <div class="item-qq-detail">
                <div>来听听老师怎么说</div>
              </div>
            </div>
            <p class="wayTitle">QQ</p>
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
      webCourseList: [
      ],
      javaExerciseList: [
        {
          'id': 1,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        },
        {
          'id': 2,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStarr': 4
        },
        {
          'id': 3,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        },
        {
          'id': 4,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        },
        {
          'id': 5,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        },
        {
          'id': 6,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        },
        {
          'id': 7,
          'javaExerciseName': 'XX教育 入学必测',
          'javaExerciseImg': 'http://p6alxlphh.bkt.clouddn.com/T1.png',
          'javaExerciseInfo': '知己知彼，百战不殆',
          'javaExerciseStar': 4
        }
      ]
    }
  },
  methods: {
    toVideo (id) {
      this.$router.push({path: `/eduRes/eduReso/eduVideo:${id}`})
    },
    handleCourse () {
      this.$axios.get('/Edu-ssm/coshow/courseshow.do').then(this.handleData)
    },
    handleData (res) {
      if (res.status === 200) {
        res = res.data
        for (let i in res) {
          this.webCourseList.push(res[i])
        }
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/')
      }
    }
  },
  mounted () {
    this.handleCourse()
  }
}
</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  text-decoration: none;
}
img {
vertical-align:middle;
border: 0;
}
p {
margin: 0 0 10px;

}
 .body {
        height:3565px;
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
          margin-top: 200px;
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
                    animation: imgMove 30s linear infinite both;
              }
                .videoItem {
                  display: inline-block;
                  vertical-align: top;
                  margin-right: 36px;
                  border-radius: 10px;
                }
                .videoPage:hover {
                  animation-play-state:paused;
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
                          font-size: 20px;
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
          .javaResPage {
            margin-top: 200px;
            width: 100%;
            height: 1400px;
          }
            .javaPort {
              margin-top: 179px;
              height: 334px;
              background: url(http://p6alxlphh.bkt.clouddn.com/java-bg.png) no-repeat;
              background-size: cover;
              padding: 106px 0;
              color: #fff;
            }
              .javaPort p {
                z-index: 200;
                text-align: center;
              }
              .javaPort p:nth-child(1) {
                font-family: STX;
                font-size: 18px;
              }
              .javaPort p:nth-child(2) {
                font-size: 14px;
              }
              .javaPort p:nth-child(3) {
                font-size: 36px;
              }
              .javaPage {
                margin-top:118px;
              }
              .container {
                min-width:1170px;
              }
              .javaMedia {
              position: relative;
              overflow: hidden;
              top: 10%;
              padding-left: 117px;
              margin-top: 100px;
              cursor: pointer;
              }
                .javaMediaPage {
                  white-space: nowrap;
                  position: relative;
                  padding-right: 20px;
                  width: 3000px;
                  animation: imgMove 30s linear infinite both;
                }
                  .javaExerciseItem {
                        margin-right: 3.16%;
                        width: 15.8%;
                        display: inline-block;
                        vertical-align: top;

                  }
                  .javaMediaPage:hover {
                    animation-play-state:paused;
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
                    .javaItemImg {
                          height: 430px;
                    }
                    .javaItemInfo {
                          margin-top: 35px;
                          position: relative;
                    }
                      .javaItemInfo p {
                        font-size: 22px;
                        color: #242424;
                        text-indent: 0px
                      }
                        .javaItemIntro {
                          font-family: PingFangM;
                          font-size: 18px;
                          color: #747474;
                        }
                        .javaItemStar {
                          display: inline-block;
                          position: absolute;
                          bottom: 4px;
                          right: 0;
                          height: 20px;
                        }
                          .javaItemStar span {
                            background: url(http://p6alxlphh.bkt.clouddn.com/star.png);
                            display: inline-block;
                            width: 20px;
                            height: 20px;
                            background-size: contain;
                            margin-right: 5px;
                          }
          .resContact {
            margin-top: 150px;
            margin-bottom: 500px;
          }
            .contactTitle {
              text-align: center
            }
              .contactTitle p:nth-child(1) {
                font-size: 40px;
                margin-bottom: 13px;
              }
              .contactTitle p:nth-child(2) {
                font-family:'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
                font-size: 20px;
              }
              .contactTitle span {
                display: block;
                width: 20px;
                height: 2px;
                margin: 25px auto 0;
                background-color: #be926f;
              }
            .contactWay {
              width: 1300px;
              margin: 52px auto 0;
            }
              .contactWayItem {
                display: inline-block;
                padding: 0 45px;
              }
              .wayTitle {
                    color: #222;
                    font-size: 24px;
                    text-align: center;
                    margin-top: 20px;
              }
                .item-wrapper {
                  width: 333px;
                  height: 480px;
                  background-color: #f4f4f4;
                }
                  .item-wx-photo {
                    position: relative;
                    top: 96px;
                    width: 100%;
                    background: url(http://p6alxlphh.bkt.clouddn.com/wechat.png);
                    background-repeat: no-repeat;
                    background-position-x: 50%;
                    background-size: contain;
                    height: 56px;
                  }
                  .item-phone-photo {
                    position: relative;
                    top: 96px;
                    width: 100%;
                    background: url(http://p6alxlphh.bkt.clouddn.com/phone.png);
                    background-repeat: no-repeat;
                    background-position-x: 50%;
                    background-size: contain;
                    height: 56px;
                  }
                  .item-qq-photo {
                    position: relative;
                    top: 96px;
                    width: 100%;
                    background: url(https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1567381953,3687108361&fm=27&gp=0.jpg);
                    background-repeat: no-repeat;
                    background-position-x: 50%;
                    background-size: contain;
                    height: 56px;
                  }
                  .item-wx-qrcode {
                    background: url("../../../assets/qr.jpg") no-repeat 50% 0 / contain;
                    width: 100%;
                    height: 100px;
                    position: relative;
                    top: 135px;
                  }
                  .item-phone-phoneNumber {
                    position: relative;
                    top: 185px;
                    width: 100%;
                    color: #666;
                  }
                  .item-qq-a {
                        background: url(http://p6alxlphh.bkt.clouddn.com/link-teacher.png) no-repeat 50% 0 / contain;
                        display: block;
                        width: 100%;
                        height: 33px;
                        position: relative;
                        top: 195px;
                  }
                  .numberP {
                      font-family: STX;
                      margin: 0;
                      font-size: 16px;
                      margin-bottom: 10px;
                      text-align: center;
                    }
                  .item-wx-detail {
                    position: relative;
                    top: 195px;
                    text-align: center;
                    font-size: 16px;
                    color: #666;
                  }
                  .item-phone-detail {
                    position: relative;
                    text-align: center;
                    font-size: 16px;
                    color: #666;
                    top: 260px;
                  }
                  .item-qq-detail {
                    position: relative;
                    text-align: center;
                    font-size: 16px;
                    color: #666;
                    top: 273px;
                  }

</style>
