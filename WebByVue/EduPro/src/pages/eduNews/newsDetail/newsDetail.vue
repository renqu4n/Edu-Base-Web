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
                        <router-link to="/eduNews"><a>首页</a></router-link>
                        >
                        <router-link to="/eduNews"><a>新闻资讯</a></router-link>

                    </div>
                    <div class="title">{{newsDetail.new_title}}</div>
                    <div class="time">
                        发布时间：{{newsDetail.release_time}}<span></span>
                        来源：{{newsDetail.new_author}}
                    </div>
                    <div class="content">
                        {{newsDetail.new_content}}
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
import swiper from '../components/newsSwiper'
export default {
  name: 'eduNewsDetail',
  data () {
    return {
      newsDetail: {},
      newsId: Number
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
        res = res.data
        console.log(this.newsId)
        this.newsDetail = res[this.newsId - 32]
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/eduNews')
      }
    }
  },
  mounted () {
    this.newsId = this.$route.params.newsId
    this.getData()
  }

}

</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
    text-decoration: none;
}
    .body {
        height:2200px;
        width: 100%;
    }
        .newsPage {
            position: absolute;
            width: 100%;
            height: 500px;
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
                margin: 20px auto;
                width: 1225px;
                height: 648px;
                /* background: lightgreen; */
                position: relative;

            }
            .newsHome {
                line-height: 40px;
                border-bottom: 1px solid #999;
            }
                .newsHome a {
                    color: black;
                    cursor: pointer;
                }
                .newsHome a:hover {
                    color: rgb(255, 128, 0);
                    text-decoration: underline;
                }
            .title {
                text-align: center;
                font-size: 30px;
                margin-top: 30px;
            }
            .time {
                width: 100%;
                background: rgb(238, 238, 238);
                line-height: 30px;
                text-align: center;
                margin: 60px auto;
                font-size: 14px;
            }
            .time span {
                display: inline-block;
                width: 50px;
            }
            .content {
                line-height: 30px;
                white-space: normal;
                overflow: hidden;
                text-overflow: ellipsis;
            }
</style>
