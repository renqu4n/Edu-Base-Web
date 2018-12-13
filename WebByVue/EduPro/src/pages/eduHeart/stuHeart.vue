<template>
    <div>
    <holder style="position:absolute;z-index:3;" :user='user'></holder>
      <!-- <swiper style="position:absolute;z-index:1;">
      </swiper> -->
    <div class="heartPage">
      <div class="heartTitle">
            <p>学员心声</p>
            <span>桃李不言🎐️下自成蹊</span>
      </div>
      <div class="heartTable">
        <h2>{{messageConut}}条留言</h2>
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
        <div class="paginationPage">
        <v-pagination  @page-change="pageChange" @page-size-change="pageSizeChange" :total='messageConut' :page-size="pageSize"></v-pagination>
        </div>
      </div>
      <div class="heartTitle" style="margin-top:200px;">
        <p>留言板</p>
        <span>赠人玫瑰🌹️手有余香</span>
      </div>
      <div class="message-board">
        <!-- 留言功能 -->
        <form action="insertMessage.do" method="post" @submit="checkMessage">
          <p>留下你的心声(留言会经过我们审核哦!)</p>
          <textarea v-if="textarea1"  name="input" @click="checkUser"></textarea>
          <div class="textareaRebox" v-if="textarea2">
            <a href="login.html"><div class="loginCheck">请先登录</div></a>
          </div>
          <div class="textareaRebox" v-if="textarea3">
            <div class="loginCheck">你不是学员不能留言！</div>
          </div>
          <p><b>当前日期</b>:<span>{{time}}</span></p>
          <p><input type="submit" id="submit" value ="提交" disabled='disabled' /></p>
        </form>
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
      heartData: [],
      time: '',
      messageConut: 0,
      messageFlag: false,
      textarea1: true,
      textarea2: false,
      textarea3: false,
      pageSize: 30,
      user: null
    }
  },
  mounted () {
    this.handleMessage()
    this.checkLogin()
    this.time = new Date().toLocaleDateString()
  },
  methods: {
    handleMessage () {
      this.$axios.get('/Edu-ssm/getStudentThink.do').then(this.handleData)
    },
    checkLogin () {
      // this.textarea1 = false
      // this.textarea2 = true
      this.$axios.get('/Edu-ssm/getLoginUser.do').then(this.loginStatus)
    },
    // 获取学员心声的留言版
    handleData (res) {
      if (res.status === 200) {
        res = res.data
        for (let i in res) {
          if (res[i].check === 1) {
            this.heartInfo.push(res[i])
          }
        }
        this.messageConut = this.heartInfo.length
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/index.htm/eduHeart')
      }
    },
    // 判断登录状态
    loginStatus (res) {
      if (res.status === 200) {
        console.log(res)
        res = res.data[0]
        if (res == null) {
          console.log('您还未登录!')
        } else {
          if (res.role_id === 2) {
            this.user = res.user_name
            console.log('欢迎您' + this.user)
          } else {
            this.textarea1 = false
            this.textarea2 = false
            this.textarea3 = true // 当登录的用户不是学员时，提示不能留言
          }
        }
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/index.html/eduHeart')
      }
    },
    checkUser () {
      if (this.user == null) {
        this.textarea1 = false
        this.textarea2 = true
      } else {
        document.getElementById('submit').disabled = false
      }
    },
    getTableData () {
      this.heartInfo = this.heartInfo.slice((this.pageIndex - 1) * this.pageSize, (this.pageIndex) * this.pageSize)
    },
    pageChange (pageIndex) {
      this.pageIndex = pageIndex
      this.getTableData()
      console.log(pageIndex)
    },
    pageSizeChange (pageSize) {
      this.pageIndex = 1
      this.pageSize = pageSize
      this.getTableData()
    },
    checkMessage () {
      var message = document.getElementsByTagName('textarea')[0].value
      if (message === '' || message.includes('<html>')) {
        alert('留言格式错误！')
        return false
      } else {
        this.$message({
          type: 'success',
          message: '留言成功!'
        })
        return true
      }
    }
  }
}
</script>

<style scoped>
* {
  padding: 0;
  margin: 0;
}
/* v-pagination {
  position: relative;
  right: 0;
} */
.body {
}
        .heartPage {
            /* width: 100%; */
            /* height: 000px; */
            z-index: 2;
            word-break: break-all;
            word-wrap: break-word;
        }
            .heartTitle {
                /* height: 170px; */
                /* width: 100%; */
                margin-top: 100px;
                margin-bottom: 56px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 40px;
            }
            .heartTitle span {
                font-size: 20px;
                color: #666;
            }
            .heartTitle span:after {
                content: "";
                display: block;
                margin: 30px auto;
                width: 20px;
                height: 2px;
                background: #be926f;
                /* clear: both; */
            }
            .heartTable {
                  margin-bottom: 15px;
                  background-color: #eee;
                  border-radius: 5px;
                  padding: 15px 19px;
                  width: 1300px;
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
                /* position: relative; */
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
                .paginationPage {
                  margin: 0 auto;
                  width: 500px;
                  /* height: 50px; */
                }
            .message-board {
              width: 1300px;
              /* height: 500px; */
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
              width: 1300px;
              height: 300px;
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
            .message-board #submit {
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
