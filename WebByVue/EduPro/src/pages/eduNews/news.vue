<template>
    <div>
        <holder style="position:absolute;z-index:3;"></holder>
        <div class="body">
            <swiper style="position:absolute;z-index:1;"></swiper>
            <div class="newsPage">
                <div class="newsTitle">
                    <p>新闻资讯</p>
                    <span>了解最新教育新闻资讯</span>
                </div>
                <div class="newsTable">
                    <div class="newsHome">
                        <router-link to="/eduNews"><a>首页</a></router-link
                        >
                        >
                        <a>新闻资讯</a>

                    </div>
                    <ul>
                        <!-- <router-link to="/eduNews/eduNewsDetail/1"> -->
                        <li v-for="item of newsList" :key="item.id">
                            <a href="#" title="新闻名称" @click="toDetail(item.id)">
                            <span>{{item.new_title}}</span>
                            <span style="position:absolute;right:0">{{item.release_time}}</span>
                            </a>
                        </li>
                        <!-- </router-link> -->
                    </ul>
                    <div class="newsMenu" v-if="newsCount">
                        <span class="newsIndex">1</span>
                        <router-link to="/eduNews2"><a href="newsSecond" title="第二页">2</a></router-link>
                        <router-link to="/eduNews2"><a href="newsSecond" title="下一页">下一页</a></router-link>
                        <router-link to="/eduNews2"><a href="newsSecond" title="最后一页">最后</a></router-link>
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
  name: 'eduNews',
  data () {
    return {
      newsList: [],
      newsCount: false
    }
  },
  components: {
    holder,
    foot,
    swiper
  },
  methods: {
    getData () {
      this.$axios.get('/Edu-ssm/getNew.do').then(this.handleData)
    },
    handleData (res) {
      if (res.status === 200) {
        console.log(res)
        res = res.data
        if (res.length > 10) {
          this.newsCount = true
        }
        for (let i in res) {
          this.newsList.push(res[i])
        }
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/eduNews')
      }
    },
    toDetail (id) {
      // 传入点击的列表id到下一个页面
      this.$router.push({path: `/eduNews/eduNewsDetail/${id--}`})
    }
  },
  mounted () {
    this.getData()
  }
}
</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
    text-decoration: none;
    /* list-style-image: url(../../assets/news-li.png); */
}
    .body {
        height:1695px;
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
                .newsHome a {
                    color: black;
                    cursor: pointer;
                }
                .newsHome a:hover {
                    color: rgb(255, 128, 0);
                    text-decoration: underline;
                }
            .newsTable ul {
                margin-top: 30px;
            }
            .newsTable ul li a {
                color: #888;
            }
            .newsTable ul li a:hover {
                color: rgb(255, 128, 0);
                text-decoration: underline;
            }
            .newsTable li {
                line-height: 40px;
                background: url(../../assets/news-li.png) no-repeat left center;
                padding-left:20px;
                width: 900px;
                box-sizing: border-box;
                text-overflow: ellipsis;
                overflow: hidden;
                white-space: nowrap;
            }

            .newsMenu {
                position: absolute;
                width: 200px;
                right: 0;
                margin-top: 30px;
            }
            .newsMenu a {
                margin-left: 5px;
                 color: black;
            }
            .newsMenu a:hover{
                text-decoration: underline;
            }
            .newsIndex {
                display: inline-block;
                width: 22px;
                height: 22px;
                background: rgb(255, 128, 0);
                text-align: center;
            }
</style>
