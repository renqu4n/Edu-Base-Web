<template>
    <div>
        <holder></holder>
        <div class="body">
          <div class="centerPage">
            <div class="centerTitle">
                    <p>XX教育</p>
                    <span>
                      XX的初衷是为了能让每一位学员对于人生做好充足的准备，以更好的姿态成功入职高薪企业。
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
              <div></div>
              <div></div>
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
    .body {
        height:2265px;
        width: 100%;
        min-width: 1903px;
    }
    .centerPage {
        position: absolute;
        width: 100%;
        height: 1000px;
        top: 190px;
        z-index: 2;
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
      .centerIntro div p:nth-child(1){
            color: #222;
            font-family: STX;
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
</style>
