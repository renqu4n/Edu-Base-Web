<template>
    <div>
        <holder style="position:absolute;z-index:3;"></holder>
        <div class="body">
            <div class="newsPage">
                <div class="newsTitle">
                    <p>新闻中心</p>
                    <span>了解教育新闻资讯</span>
                </div>
                <div class="newsTable">

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
        }

      ]
    }
  },
  components: {
    holder,
    foot
  }

}

</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
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
            .newsTable a {
                   color:#888;
            }
            .newsTable li {
                line-height: 40px;
                background: url(../../../assets/news-li.png) no-repeat left center;
                padding-left:20px;
                box-sizing: border-box;
            }
            .newsTable a:hover{
                color: rgb(255, 128, 0);
                text-decoration: underline;
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
                margin-left: 10px;
                background: rgb(255, 128, 0);
                text-align: center;
            }
</style>
