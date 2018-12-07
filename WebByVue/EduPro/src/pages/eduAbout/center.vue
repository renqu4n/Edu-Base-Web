<template>
    <div style="">
        <holder style="z-index:999"></holder>
        <div class="body">
          <div class="centerPage">
            <div class="centerTitle">
                    <p>⭐🌙教育</p>
                    <span>
                        星月的初衷是为了能让每一位学员对于人生做好充足的准备，以更好的姿态成功入职高薪企业。
                      <p>创造价值 用心服务 保障学员 持久发展</p>
                    </span>
            </div>
            <div class="centerIntro">
              <div class="content-item content-on">
                <p>About</p>
                <p>公司于2009年启动互联网技术人才培养计划，目前培养的互联网技术人才已遍布全国及部分海外地区，是国内较早开设培养专业web技术人才的科技企业。</p>
                <p>历经多年的市场累积，独创“引导式教学”+“点对点教学服务”+“关卡制审核”系统，从而确保每位学员能在指定的培训周期中高质量的完成学习任务。</p>
              </div>
              <div class="content-item content-tw">
                <img src="../../assets/about1.png" alt="">
              </div>
              <div class="content-item content-th">
                <span class="content-border"></span>
                <div class="content-th-wrapper">
                  <p>Unique</p>
                  <ul>
                    <li>国内唯一“连续三年培养出年薪超过40W就业学员”的教育机构</li>
                    <li>国内唯一连续38个月，实现100%就业率，且学员年薪均过10W的教育机构</li>
                    <li>国内唯一可以和学员签订就业协议，就业年薪不足10W，全额退费的教育机构</li>
                  </ul>
                </div>
              </div>
              <div class="content-item content-tw">
                <img src="../../assets/about2.png" alt="">
              </div>
            </div>
            <div class="centerPost" style="z-index:1">
              <div class="center-post-content" >
                <div class="center-post-img">
                  <img src="../../assets/about4.png" alt="">
                </div>
                <div class="center-post-intro">
                  <p>总想给你最好的👏</p>
                  <p>如果一个同学来到了这里，走时只带走了技能，我们就不算成功。</p>
                  <p>在这里，你不仅可以学到技术，更能提升个人修养，更加透彻的了解世界🌏️ ，进一步寻求自己的光荣和梦想。</p>
                  <p>虽然，光荣并不容易抵达。但，希望通过我们的努力，能帮你少走些弯路。在未来的人生轨迹中更快更好的找到属于自己的生活方式，这或许就是我们送给你最珍贵的礼物🎁️。</p>
                </div>
              </div>
            </div>
            <div class="center-join">
              <div class="center-join-wrapper">
                <div class="center-join-title">
                  <p>JOIN US</p>
                  <p>热爱技术🌪热爱分享</p>
                </div>
                <div class="center-join-content">
                  <div class="center-join-content-left">
                    <p>Web前端岗位</p>
                    <p class="content-left-detail">岗位要求</p>
                    <p class="content-left-detail">1.熟练使用HTML，CSS，JavaScript、jQuery应用和web开发。</p>
                    <p class="content-left-detail">2.有CSS3、HTML5，GITHUB等前端实践经验，了解react ,redux ,vue, vuex, angularJS一种。</p>
                    <p class="content-left-detail">3.会使用至少一种前端自动化构建工具webpack，fis，gulp等。</p>
                  </div>
                  <div class="center-join-content-right">
                    <p>Java技术岗位</p>
                    <p class="content-left-detail">岗位要求</p>
                    <p class="content-left-detail">1.熟练使用java，spring、mybatis、springMVC和git开发。</p>
                    <p class="content-left-detail">2.有jsp等前端实践经。</p>
                    <p class="content-left-detail">3.会使用至少一种后端自动化构建工具webpack，fis，gulp等。</p>
                  </div>
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
  name: 'eduClass',
  components: {
    holder,
    foot
  }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}
p {
  margin:  0,0,10px;
  margin-block-start: 1em;
  margin-block-end: 1em;
  margin-inline-start: 0px;
  margin-inline-end: 0px;
}
div {
  display: block;
}
img {
  vertical-align: middle;
}
    .body {
        height:3565px;
        width: 100%;
        min-width: 1903px;
    }
    .centerPage {
        position: absolute;
        width: 100%;
        height: 1000px;
        top: 190px;
        z-index: 1;
    }
    .centerTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 65px;
            }
            .centerTitle span {
                font-size: 20px;
                color: #666;
            }
            .centerTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
    .centerIntro {
      width: 1300px;
      margin: 350px auto 0;
      height: 597.3px;
    }
     .centerIntro div p:nth-child(1){
            color: #222;
            font-family: 'Courier New', Courier, monospace;
            font-size: 32px;
      }
      .centerIntro div p:nth-child(2){
            font-size: 14px;
            line-height: 24px;
            color: #666;
            top: 30px;
      }
      .centerIntro div p:nth-child(3){
            font-size: 14px;
            line-height: 24px;
            color: #666;
            top: 30px;
      }
      .centerIntro div img {
        transition: transform .8s;
      }
      .centerIntro div img:hover {
        transform: scale(1.2,1.2)
      }
          .content-item{
            float: left;
            position: relative;
            width: 325px;
            height: 100%;
            background: lightblue;

          }
          .content-on {
            padding: 95px 50px 0;
            background:#eee;
          }
          .content-tw {
            overflow: hidden;
          }
          .content-th {
            background-color: #fafafa;
            padding: 95px 50px 0;
          }
            .content-th ul li {
              list-style: disc;
              font-size: 14px;
              color: #666;
              line-height: 24px;
              margin-bottom: 24px;
            }
          .content-border {
            position: absolute;
            width: 285px;
            height: 510px;
            border: 2px solid #b5b5b5;
            top: 60px;
            left: 20px;
          }
      .centerPost {
        margin-top: 398px;
        width: 100%;
        position: relative;
        height: 580px;
        background-color: #f7f7f7;
    }

      .center-post-content {
            position: absolute;
            top: -200px;
            left: 50%;
            transform: translateX(-50%);
            width: 1300px;
            overflow: hidden;
      }
      .center-post-img {
        float: left;
        width: 570px;
        height: 855px;
        overflow: hidden;
        transition: all 2s ease 0s;
      }
      .center-post-img:hover {
        transform: scale(1.2,1.2)
      }
      .center-post-intro {
        float: right;
        height: 855px;
        width: 730px;
        padding-left: 122px;
        padding-right: 185px;
        padding-top: 426px;
      }
      .center-post-intro p:nth-child(1) {
        font-size: 24px;
        margin-bottom: 28px;
        color: #222;
      }
      .center-post-intro p {
        font-size: 14px;
        color: #666;
        font-family: PingFangM;
        line-height: 24px;
      }
      .center-join {
        width: 1170px;
        margin: 278px auto 200px;
        position: relative;
      }
      .center-join-wrapper {
        padding-top: 100px;
        height: 800px;
        background: url(http://p6alxlphh.bkt.clouddn.com/join.png) no-repeat;
        background-size: cover;
      }
        .center-join-title {
          text-align: center;
          color: #fff;
        }
          .center-join-title p:nth-child(1) {
            font-size: 70px;
            margin-bottom: 0;
          }
          .center-join-title p:nth-child(2) {
            font-family: PingFangM;
            font-size: 18px;
          }
        .center-join-content {
          width: 640px;
          margin: 65px auto 0;
          font-size: 20px;
          color: #fff;
        }
          .center-join-content-left {
                float: left;
                position: relative;
                width: 255px;
                height: 324px;
                display: inline-block;
                border: 2px solid #fff;
                padding: 35px 34px 0;
                font-family: PingFangM;
          }
          .content-left-detail {
            font-size: 13px!important;
            line-height: 17px;
            margin-bottom: 0;
          }
          .center-join-content-left::after {
                content: '';
                display: inline-block;
                width: 20px;
                height: 2px;
                background-color: #be926f;
                position: absolute;
                bottom: 20px;
                left: 50%;
                transform: translateX(-50%);
          }
          .center-join-content-left p {
                display: block;
                margin-top: 0;
                padding-top: 0;
          }
          .center-join-content-left p:nth-child(2) {
                margin-bottom: 12px;
          }
          .center-join-content-right {
                float: left;
                position: relative;
                width: 255px;
                height: 324px;
                display: inline-block;
                border: 2px solid #fff;
                padding: 35px 34px 0;
                font-family: PingFangM;
                margin-left: 130px;
          }
          .center-join-content-right p {
                display: block;
                margin-top: 0;
                padding-top: 0;
          }
          .center-join-content-right p:nth-child(2) {
                margin-bottom: 12px;
          }
          .center-join-content-right::after {
                content: '';
                display: inline-block;
                width: 20px;
                height: 2px;
                background-color: #be926f;
                position: absolute;
                bottom: 20px;
                left: 50%;
                transform: translateX(-50%);
          }

</style>
