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
        <table class="heartTable" cellpadding="0" cellspacing="0">
          <tr class="table-header">
            <th style="width:11%">学员名字</th>
            <th style="width:67%">内容</th>
            <th style="width:11%">时间</th>
          </tr>
          <tr v-for="(item,index) of heartInfo" :key="index" class="table-info">
            <th style="width:11%">{{item.name}}</th>
            <th style="width:67%">{{item.content}}</th>
            <th style="width:11%">{{item.time}}</th>
          </tr>
        </table>
        <div class="heartMenu">
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
          <form action="" method="">
            <p>留下你的心声</p>
            <textarea></textarea>
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
      heartInfo: [
        {
          'id': 1,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 2,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 3,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 4,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 5,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 6,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 7,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 8,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 9,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }, {
          'id': 10,
          'name': '学员',
          'content': '插入留言插入留言插入留言插入留言插入留言',
          'time': '2018-11-15'
        }],
      time: ''
    }
  },
  mounted () {
    var myDate = new Date()
    this.time = myDate.toLocaleDateString()
  },
  methods: {
  }
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
}
.body {
  height:3595px;
  width: 100%;
}
.heartPage {
            position: absolute;
            width: 100%;
            height: 100%;
            top: 1180px;
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
              height: 700px;
              width: 1320px;
              margin: 0 auto;
              position: relative;
              text-align: center;
              border-top: 2px solid rgb(34, 34, 34);
           }
           .table-header {
             height:50px;
           }
           .table-header>th {
              background: #f5f5f5;
              height: 33px;
              line-height: 33px;
              border:solid 1px #e2e2e2;
           }
           .table-info>th {
                  border: solid 1px #e2e2e2;
                  line-height: 24px;
                  background: #fcfcfc;
                  padding: 5px;
                  font-weight: normal;
           }
           .heartMenu {
                position: absolute;
                width: 200px;
                left: 50%;
                margin-left: -100px;
                margin-top: 30px;
            }
            .heartMenu a {
                margin-left: 5px;
                 color: black;
            }
            .heartMenu a:hover{
                text-decoration: underline;
            }
            .heartIndex {
                display: inline-block;
                width: 22px;
                height: 22px;
                background: rgb(34,34,34);
                text-align: center;
                color: #fcfcfc;
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
              width: 1298px;
              height: 300px;
              font-size: 20px;
              line-height: 20px;
              font-family: Verdana, Geneva, Tahoma, sans-serif;
            }
            .message-board button {
              margin-top: 30px;
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
