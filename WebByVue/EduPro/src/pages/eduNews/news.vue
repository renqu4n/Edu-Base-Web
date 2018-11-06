<template>
    <div>
        <holder style="position:absolute;z-index:3;"></holder>
        <div class="body">
            <swiper style="position:absolute;z-index:1;"></swiper>
            <div class="newsPage">
                <div class="newsTitle">
                    <p>新闻中心</p>
                    <span>了解教育新闻资讯</span>
            </div>
                <div class="newsTable">
                    <div class="newsHome">
                        <a style="color:black;cursor:pointer;">首页</a>
                        >
                        <a style="color:black;cursor:pointer">新闻资讯</a>

                    </div>
                    <ul>
                        <li v-for="item of newsList" :key="item.id">
                            <a href="#" title="新闻名称">
                            <span>{{item.content}}</span>
                            <span style="position:absolute;right:0">{{item.time}}</span>
                            </a>
                        </li>
                    </ul>
                    <div class="newsMenu">
                        <span class="newsIndex">1</span>
                        <router-link to="/eduNews2"><a href="newsSecond" title="第二页">2</a></router-link>
                        <router-link to="/eduNews2"><a href="" title="下一页">下一页</a></router-link>
                        <router-link to="/eduNews2"><a href="" title="最后一页">最后</a></router-link>
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
import swiper from './components/newsSwiper'
// import func from './vue-temp/vue-editor-bridge'
export default {
  name: 'eduClass',
  data () {
    return {
      newsList: [
        {
          'id': 1,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 2,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 3,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 4,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 5,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 6,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 7,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 8,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 9,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 10,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 11,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 12,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 13,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 14,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }, {
          'id': 15,
          'content': '这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻这是一条新闻新闻新闻新闻',
          'time': '2018-11-5'
        }

      ]
    }
  },
  components: {
    holder,
    foot,
    swiper
  }

//   mounted () {
//     let url = ''
//     this.$ajax({
//       type: 'get',
//       url: url,
//       dataType: 'json',
//       success: function (data) {
//         if (data.status === 0) {
//           var a = data.data.list
//           func(a)
//         } else {
//           alert('接口调用失败')
//         }
//       },
//       error: function (data) {
//         alert(JSON.stringify(data))
//       }

//     })
//   }
}
</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
    /* list-style-image: url(../../assets/news-li.png); */
}
    .body {
        height:2165px;
        width: 100%;
    }
        .newsPage {
             position: absolute;
            width: 100%;
            height: 1000px;
            top: 580px;
            z-index: 2;
        }
            .newsTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                margin-bottom: 56px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 40px;
            }
            .newsTitle span {
                font-size: 20px;
                color: #666;
            }
            .newsTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
            .newsTable {
                margin: 0 auto;
                width: 1225px;
                height: 648px;
                /* background: lightgreen; */
                position: relative;

            }
            .newsHome {
                line-height: 40px;
                border-bottom: 1px solid #999;
            }
                .newsHomeImg {
                    display: inline-block;
                    background: url(../../assets/news-home.png)
                }
            .newsTable a {
                color: #888;
            }
            .newsTable a:hover {
                color: rgb(255, 128, 0);
                text-decoration: underline;
            }
            .newsTable li {
                line-height: 40px;
                background: url(../../assets/news-li.png) no-repeat left center;
                padding-left:20px;
                box-sizing: border-box;
            }
            .newsMenu {
                position: absolute;
                width: 200px;
                right: 0;
                margin-top: 30px;
            }
            .newsMenu a {
                margin-left: 5px;
            }
            .newsIndex {
                display: inline-block;
                width: 22px;
                height: 22px;
                background: rgb(255, 128, 0);
                text-align: center;
            }
</style>
