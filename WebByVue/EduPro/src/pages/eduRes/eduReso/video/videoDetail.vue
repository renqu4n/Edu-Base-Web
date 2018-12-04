<template>
  <div>
    <holder z-index=3></holder>
    <div class="videoPage">
      <div class="videoWrapper">
        <div class="videoTitle">
          <p>课程视频</p>
          <span>业精于勤，荒于嬉</span>
        </div>
        <router-link to="/eduRes/eduReso"><button class="return">返回</button></router-link>
        <div class="video">
          <video src="http://www.w3school.com.cn/i/movie.ogg" controls="controls"></video>
          <div class="videoInfo">
            <div class="teacherInfo">
              <img src="https://img2.mukewang.com/558f98f00001537842083120-100-100.jpg" alt="">
              <span>Mr.Dannier</span>
              <span>web前端开发工程师</span>
            </div>
            <div class="courseInfo">
              <span>淘宝商城项目开发</span>
              <span>采用spring cloud netflix中的ribbon、eureka、hystrix、zuul等，结合淘宝的多层服务架构，讲解如何使用微服务的方式搭建淘宝商城。 课程目标：1. 掌握ribbon、eureka、hystrix、zuul等搭建微服务项目的方法 2. 微服务架构和RPC架构对比，掌握微服务架构的合理使用场景 3. 了解微服务架构的缺陷和不足</span>
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
  name: 'eduVideo',
  components: {
    holder,
    foot
  },
  data () {
    return {
      videoId: Number
    }
  },
  methods: {

  },
  mounted () {
    this.videoId = this.$route.params.videoId
    // this.getData
  }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
}
.videoPage {
  height: 1200px;
  width: 100%;
  min-width: 1903px;
}
  .videoWrapper {
    margin-top: 90px;
  }
  .videoTitle {
      height: 170px;
      width: 100%;
      padding-top: 90px;
      margin-bottom: 56px;
      /* background: rebeccapurple; */
      text-align: center;
      font-size: 40px;
  }
  .videoTitle span {
      font-size: 20px;
      color: #666;
  }
  .videoTitle span::after {
      content: "";
      display: block;
      margin: 30px auto 0;
      width: 20px;
      height: 2px;
      background: #be926f;
  }
  .return {
    width: 60px;
    height: 60px;
    border-radius: 50%;
    border: none;
    box-shadow: 5px 5px 2px rgba(0, 0, 0,0.5);
    margin-left: 200px;
    margin-bottom: 20px;
    background: #dddddd;
  }
  .return::before {
    content: '';
    width: 50px;
    height: 50px;
    color: #222;
    transform: rotate(35deg)
  }
  .video {
    width: 1500px;
    height: 600px;
    margin: 0 auto;
    /* background: wheat; */
  }
  .video video {
    height: 600px;
    width: 1150px;
    border: 1px solid black;
    border-radius: 20px;
  }
  .video .videoInfo {
    /* width: 350px; */
    height: 600px;
    float: right;
    background: whitesmoke;
    border-radius: 5%;
  }
  .videoInfo .teacherInfo {
    width: 326px;
    height: 100px;
    line-height: 100px;
    /* background: violet; */
    padding: 10px;

  }
  .teacherInfo img {
    border-radius: 50%;
    transition: transform 1s;
    overflow: hidden;
  }
  .teacherInfo img:hover {
    transform: scale(1.2)
  }
  .teacherInfo span:nth-child(2) {
    font-size: 16px;
    color:black;
    top: -60px;
    left: 40px;
    position: relative;
  }
  .teacherInfo span:nth-child(3) {
    font-size: 2px;
    color: #666;
    top: -20px;
    left: -50px;
    position: relative;
  }
  .courseInfo {
    height: 480px;
    width: 348px;
  }
  .courseInfo span:nth-child(1) {
    display: inline-block;
    font-size: 30px;
    padding: 50px 10px;
  }
  .courseInfo span:nth-child(2){
    display: block;
    font-size: 20px;
    padding: 0px 10px;
    line-height: 1.5rem;
    color: #222
  }
  .courseInfo span:hover {
    color:#7b7b7b;
  }
</style>
