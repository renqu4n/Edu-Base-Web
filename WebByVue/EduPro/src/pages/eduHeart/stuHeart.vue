<template>
    <div>
    <holder style="position:absolute;z-index:3;"></holder>
    <div class="body">
      <swiper style="position:absolute;z-index:1;">
      </swiper>
      <div class="heartPage">
        <div class="heartTitle">
          <p>学员心声</p>
          <span>桃李不言，下自成蹊</span>
        </div>
        <div class="heartTable">
          <h2>{{messageConut}}个回答</h2>
          <div class="heartWrapper">
            <div class="heartItem" v-for="item of heartInfo" :key="item.mid">
              <div class="heartUser">
                <a href="">
                  <img src="http://tx.tianyaui.com/logo/small/132409785" alt="">
                  <span>{{item.user_name}}</span>
                </a>
                &nbsp;{{item.data}}
              </div>
              <div class="heartContent">
                {{item.message_content}}
              </div>
              <div class="heartCtr">
                <span>
                  <i class="heartStar"></i>
                  <a href="">举报</a>
                </span>
              </div>
            </div>
          </div>
        </div>
        <div class="heartMenu" v-if="messageFlag">
            <span class="heartIndex">1</span>
            <router-link to="/heartSecond"><a href="newsSecond" title="第二页">2</a></router-link>
            <router-link to="/heartSecond"><a href="newsSecond" title="下一页">下一页</a></router-link>
            <router-link to="/heartSecond"><a href="newsSecond" title="最后一页">最后</a></router-link>
        </div>
        <div class="heartTitle" style="margin-top:100px;">
          <p>留言板</p>
          <span>赠人玫瑰，手有余香</span>
        </div>
        <div class="message-board">
          <!-- 留言功能 -->
          <form action="insertMessage.do" method="post">
            <p>留下你的心声</p>
            <textarea v-if="textarea1" name="input" @click="checkLogin"></textarea>
            <div class="textareaRebox" v-if="textarea2">
              <a href="login.html"><div class="loginCheck">请先登录</div></a>
            </div>
            <p><b>当前日期</b>:<span>{{time}}</span></p>
            <p><button>提交</button></p>
          </form>
        </div>
      </div>
    </div>
    <foot></foot>
    </div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import swiper from './components/heartSwiper'
import { quillEditor } from 'vue-quill-editor'
export default {
  name: 'eduHeart',
  components: {
    holder,
    foot,
    swiper,
    quillEditor
  },
  data () {
    return {
      heartInfo: [],
      time: '',
      messageConut: Number,
      messageFlag: false,
      textarea1: true,
      textarea2: false
    }
  },
  mounted () {
    this.handleMessage()
    var myDate = new Date()
    this.time = myDate.toLocaleDateString()
    this.subDate()
  },
  methods: {
    handleMessage () {
      this.$axios.get('/Edu-ssm/getStudentThink.do').then(this.handleData)
      // this.$axios({
      //   method: 'post',
      //   url: '/Edu-ssm/insertMessage.do',
      //   data: {}})
    },
    checkLogin () {
      // this.textarea1 = false
      // this.textarea2 = true
    },
    handleData (res) {
      if (res.status === 200) {
        res = res.data
        console.log(res)
        this.messageConut = res.length
        if (res.length > 15) {
          this.messageFlag = true
        }
        for (let i in res) {
          for (let j in JSON.parse(res[i].json)) {
            this.heartInfo.push(JSON.parse(res[i].json)[j])
          }
        }
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/')
      }
    },
    subDate () {
      for (let i = 0; i < this.heartInfo.length; i++) {
        this.heartInfo[i].data = this.heartInfo[i].data.substr(0, this.heartInfo[i].length - 2)
      }
    }
    // 发送POST请求
    // sendData () {
    //   this.$axios({
    //     method: 'post',
    //     url: '/insertMessage.do',
    //     data: {
    //       'name': '张三',
    //       'content': '这是我的心声心声啊心声啊',
    //       'time': this.time
    //     }
    //   }).then((res) => {
    //     console.log(res.data)
    //   })
    // }
  }
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
}
.body {
  position: relative;
  height:3095px;
  width: 100%;
}
.heartPage {
            position: absolute;
            width: 100%;
            height: 1500px;
            top: 1160px;
            z-index: 2;
        }
            .heartTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                margin-bottom: 56px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 40px;
            }
            .heartTitle span {
                font-size: 20px;
                color: #666;
            }
            .heartTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
            .heartTable {
                  margin-bottom: 15px;
                  background-color: #eee;
                  border-radius: 5px;
                  padding: 15px 19px;
                  max-width: 1300px;
                  margin: 0 auto;
            }
              .heartTable h2 {
                    font-size: 16px;
                    line-height: 24px;
                    text-align: left;
                    margin-bottom: 20px;
                    margin-left: 70px;
              }
            .heartWrapper {
              margin: 50px 70px;
              padding: 0;
            }
              .heartItem {
                padding: 20px 0 15px 64px;
                border-bottom: 1px solid #888;
                position: relative;
              }
                .heartUser {
                  color: #888;
                  margin-bottom: 5px;
                  text-align: left;
                }
                  .heartUser a:nth-child(1) {
                    color: #2965b1;
                    outline: 0;
                    text-decoration: none;
                  }
                  .heartUser>a>img {
                    width: 30px;
                    height: 30px;
                    vertical-align: middle;
                    border-radius: 50%;
                    margin-right: 5px
                  }
                .heartContent {
                      font-size: 16px;
                      line-height: 28px;
                      margin-bottom: 10px;
                      word-wrap: break-word;
                      text-align: justify;
                }
                .heartCtr {
                  line-height: 22px;
                  text-align: right;
                  color: #888;
                }
                .heartCtr span a {
                  color: #888
                }
                .heartCtr span a:hover {
                  cursor: pointer;
                  text-decoration: underline
                }
                .heartStar {
                  display: block;
                  width: 30px;
                  height: 30px;
                  background: url(http://static.tianyaui.com/global/bbs/web/static/images/bbs_wenda_icons_b756c52.png) 0 -169px no-repeat;
                  position: absolute;
                  bottom: 11px;
                  right: 40px;
                  cursor: pointer;
                }
            .message-board {
              width: 1300px;
              height: 500px;
              margin: 0 auto;
                /* border: 1px solid black; */
            }
            .message-board p:nth-child(1) {
              color: #be926f;
            }
            .message-board p {
              font-size: 20px;
              text-align: center;
            }
            .message-board textarea {
              background: white;
              width: 1300px;
              height: 300px;
              font-size: 20px;
              line-height: 20px;
              font-family: Verdana, Geneva, Tahoma, sans-serif;
              padding: 20px;
            }
            .textareaRebox{
              border: 1px solid black;
              width: 1340px;
              height: 340px;
              font-size: 20px;
              line-height: 20px;
              font-family: Verdana, Geneva, Tahoma, sans-serif;
              cursor: pointer;
            }
              .loginCheck {
                width: 400px;
                height: 200px;
                margin: 50px auto;
                background: #888;
                text-align: center;
                border: 2px solid #888;
                border-radius: 10px;
                text-align: center;
                line-height: 200px;
              }
            .message-board button {
              width: 80px;
              height: 60px;
              border: none;
              display: inline-block;
              border-radius: 10%;
              cursor: pointer;
              background: #f5f5f5;
              -webkit-box-shadow: 0 4px 15px rgba(0,0,0,0.15);
              box-shadow: 0 4px 15px rgba(0,0,0,0.15);
              border: 0;
              text-align: center;
            }
</style>
