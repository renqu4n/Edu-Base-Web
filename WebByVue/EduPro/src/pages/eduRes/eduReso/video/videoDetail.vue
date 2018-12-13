<template>
  <div>
    <holder z-index=3 style="display:inline-block"></holder>
    <div class="videoPage">
      <div class="videoWrapper">
        <div class="videoTitle">
          <p>课程视频</p>
          <span>业精于勤，荒于嬉</span>
        </div>
        <div class="videoBreadCrumb">
          <router-link to="/eduRes/eduReso">
            <el-breadcrumb separator-class="el-icon-arrow-right">
            <el-breadcrumb-item :to="{ path: '/' }">首页</el-breadcrumb-item>
            <el-breadcrumb-item>课程所属名</el-breadcrumb-item>
            <el-breadcrumb-item>课程名</el-breadcrumb-item>
            </el-breadcrumb>
          </router-link>
        </div>
        <div class="videoBox">
          <video src="http://www.runoob.com/try/demo_source/movie.mp4" poster="https://10.url.cn/qqcourse_logo_ng/ajNVdqHZLLBsSud06XlZnJACsTWd7OSA5phIFPRTNibFBeuT8jRjy00Jb5ticSEKYUnpUYdBCicH2U/356?tp=webp" controls="controls" class="video">浏览器版本过低，不支持视频播放</video>
          <div class="videoCatalog">
            <ol class="videoList">
              <li class="videoSection">
                <h4>Java精讲课</h4>
                <ol>
                  <li class="videoItem">
                    <div class="videoItemPrefix">
                      <span class="videoItemType">录播</span>
                    </div>
                    <div class="videoItemTt">
                      <h5 class="videoItemText">Java精讲课</h5>
                      <span class="videoItemSuffix">8分钟</span>
                    </div>
                  </li>
                </ol>
              </li>
            </ol>
          </div>
          <div class="courseIntro">
            <div class="courseInfo">
              <div class="courseTitle"><h3>Web前端开发之JavaScript(Js)精英课堂<span>免费</span></h3></div>
            </div>
          </div>
        </div>
        <div class="courseDetail">
          <el-tabs type="border-card">
            <el-tab-pane>
              <span slot="label"><i class="el-icon-date"></i>课程概述</span>
              <div class="teacherInfo">
                <span >老师介绍</span>
                <div class="teacherIntro">
                  <img src="https://10.url.cn/eth/ajNVdqHZLLCwtkk83h0wo1vAcbw0zI9zl8tfq6fjhCRkYFproBVX4Weh5B16ibCSbTO4hcVW2L4Q/" alt="" class="teacherImg">
                  <div class="teacherDetail">
                    <span class="teacherName">王明明</span><br>
                    <span class="teacherShow">现任 渡一教育高级讲师，58赶集集团同城招聘事业群在职高级前端工程师</span>
                  </div>
                </div>
              </div>
            </el-tab-pane>
            <el-tab-pane>
              <span slot="label"><i class="el-icon-document"></i>课程文件</span>
                <div class="file">
                  下载<a href="/Edu-ssm/public/file/file.txt" download="课程源码">课程源码.txt</a>
                </div>
            </el-tab-pane>
          </el-tabs>
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
  list-style: none;
}
h4 {
  font-weight: 400;
  font-size: 100%;
}
::-webkit-scrollbar{
  width: 5px;
  height: 0px;
}
::-webkit-scrollbar-thumb {
  border-radius: 0px;
  background:  rgba(244,244,244,.4)
        }
::-webkit-scrollbar-track {
  border-radius: 0;
  background: rgba(0,0,0,0.1);
        }
.videoPage {
  /* height: 1200px; */
  width: 100%;
  margin-top: 90px;
}
  .videoWrapper {
    margin-top: 90px;
  }
  .videoTitle {
      /* height: 170px; */
      width: 100%;
      /* padding-top: 90px; */
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
 .videoBreadCrumb {
      /* position: absolute; */
      margin-left: 380px;
      top: 200px;
 }
.videoBox {
  width: 1140px;
  height: 580px;
  margin: 20px auto;
  background: springgreen;
  position: relative;
}
.video {
  width: 840px;
  height: 490px;
  object-fit: fill;
  position: absolute;
  left: 0;
  top: 0;
}
.videoCatalog {
  width: 300px;
  height: 490px;
   background-color: #131313;
  font-size: 12px;
  vertical-align: top;
  position: absolute;
  right: 0;
  top: 0;
  overflow: auto;
}
.courseIntro {
  height:  90px;
  width: 1140px;
  position: absolute;
  left: 0;
  bottom: 0;
  background: #232323;
  padding: 14px 16px;
  box-sizing: border-box;
}
.videoList::before {
    content: '精选视频';
    z-index: 1;
    width: 300px;
    height: 20px;
    background-color: black ;
    position: absolute;
    text-align: center;
    color: white;
    font-weight: 500;
    top: 0;
    left: 0;
}
.videoList {
    box-sizing: border-box;
    height: 100%;
    padding: 20px 16px;
    overflow: auto;
    color: #c7c7c7;
    font-size: 14px;
    overflow-x: hidden;
    overflow-y: auto;
}
.videoSection {
    margin-top: 16px;
    margin-bottom: 32px;
    position: relative;
}
.videoSection::after {
    content: "";
    position: absolute;
    height: 1px;
    width: 100%;
    bottom: -16px;
    background-color: rgba(244,244,244,.1);
}
.videoSection h4:nth-child(1) {
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
.videoItem {
    margin-top: 16px;
    display: block;
    color: #c7c7c7;
    cursor: pointer;
}
.videoItem:hover {
  color: #23b8ff;
}
.videoItemPrefix {
  float: left;
}
.videoItemType {
    background-color: #23b8ff;
    color: #0f0f0f;
    display: block;
    box-sizing: border-box;
    width: 30px;
    height: 16px;
    line-height: 16px;
    border-radius: 2px;
    text-align: center;
    color: #0f0f0f;
    font-size: 12px;
    position: relative;
    top: 1px;
    padding-left: 1px;
}
.videoItemTt {
    margin-left: 40px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
.videoItemText {
    font-size: 14px;
    line-height: 20px;
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}
.videoItemSuffix {
    font-size: 12px;
    line-height: 16px;
    /* color: #777; */
}
.courseInfo {
  max-width:850px;
}
.courseTitle {
  font-size: 22px;
  line-height: 32px;
  text-align: left;
}
.courseTitle h3 {
  color: #f4f4f4;
  display: inline-block;
  max-width: 780px;
  vertical-align: top;
  font-weight: 400;
}
.courseTitle span:nth-child(1) {
    color: #ff4f23;
    display: inline-block;
    margin-left: 12px;
    vertical-align: top;
}
.courseDetail {
  width: 1140px;
  margin: 0 auto;
}
.teacherInfo span:nth-child(1){
  display: inline;
}
.teacherIntro {
  width: 100%;
  height:100px;
  padding: 4px;
  display: flex;
}
.teacherImg {
  width: 92px;
  height: 92px;
  border-radius: 50%;
  margin-left: 50px;
}
.teacherDetail {
  padding: 10px;
  flex: 1;
  /* background: springgreen; */
}
.teacherName {
  color: #23b8ff;
  display: inline;
  font-size: 18px;
}
.teacherShow {
  line-height: 20px;
  color: #222;
  overflow: hidden;
}
.file {
  width: 100%;
  height: 50px;
  padding: 5px;
}
.file a {
  margin-left: 20px;
}
</style>
