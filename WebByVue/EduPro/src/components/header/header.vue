<template>
  <div>
    <div class="head head-show" id="headNav">
      <div class="head-box" >
        <div class="logo">
          <img src="..\..\assets\logo.png">
        </div>
        <ul class="header-right" id="wrapNav">
          <li class="header-li"><a><span>新闻资讯</span></a></li>
          <li class="header-li"><a><span>中心简介</span></a></li>
          <li class="header-li"><a><span>培训课程</span></a></li>
          <li class="header-li"><a><span>培训动态</span></a></li>
          <li class="header-li"><a><span>学员心声</span></a></li>
          <li class="header-li"><a><span>登录</span></a></li>
        </ul>

      </div>
      <button id="menuBtn" class="menuBtn" @click="hiddenBtn()">菜单</button>
    </div>
  </div>
</template>
<script>

export default {
  name: 'holder',
  data () {
    return {
      scrollTop: null
    }
  },
  mounted () {
    // 控制当屏幕滚动超过90px时，隐藏菜单栏
    window.addEventListener('scroll', () => {
      this.scrollTop = document.documentElement.scrollTop
      // 控制滚动按钮的隐藏或显示
      if (this.scrollTop > 90) {
        this.isScrollTop = true
        this.showBtn()
      } else {
        this.isScrollTop = false
        this.hiddenBtn()
      }
    }, true)
  },
  methods: {
    // 隐藏按钮、显示导航栏
    hiddenBtn () {
      this.$get('menuBtn').style.opacity = 0
      this.$get('menuBtn').style.visibility = 'hidden'
      this.$get('menuBtn').style.position = 'absolute'
      this.$get('menuBtn').style.right = 700 + 'px'
      this.$get('menuBtn').style.transform = 'rotate(-45deg)'
      this.$get('headNav').style.position = 'fixed'
      // this.$get('headNav').className = 'head head-show'
      // this.$get('headNav').style.width = '100%'
      this.$get('wrapNav').style.right = 50 + 'px'
      this.$get('wrapNav').style.transform = 'rotate(0deg)'
    },
    // 显示按钮、隐藏顶部导航栏
    showBtn () {
      this.$get('menuBtn').style.opacity = 1
      this.$get('menuBtn').style.visibility = 'visible'
      this.$get('menuBtn').style.position = 'fixed'
      this.$get('menuBtn').style.right = 170 + 'px'
      this.$get('menuBtn').style.outline = 'none'
      this.$get('menuBtn').style.transform = 'rotate(0deg)'
      this.$get('headNav').style.position = 'absolute'
      // this.$get('headNav').className = 'head head-hidden'
      // this.$get('headNav').style.width = 0
      this.$get('wrapNav').style.right = 200 + 'px'
      this.$get('wrapNav').style.transform = 'rotate(1deg)'
    }
  }
}
</script>

<style>
* {
  margin: 0;
  padding: 0;
  list-style: none;
}
  .head {
    width: 100%;
    height: 90px;
    min-width: 1300px;
    background:#222;
    position: absolute;
    top: 0;
    left: 0;
    right: 0;
    font-size: 16px;
    transition: all .8s;
  }
  /* .head-show {
    opacity: 1;
    visibility: visible;
  }
  .head-hidden {
    opacity: 0;
    visibility: hidden;
  } */
    .head-box {
      margin: 0 58px 0 380px;

    }
      .logo {
        float: left;
        margin-top:24px;
      }
      .logo img {
        height:42px;
        width: 38px;
      }
      .header-right {
        position: relative;
        float: right;
        height: 90px;
        padding-right:150px;
        /* display: inline-block; */
        transition: all 1.5s;
        /* visibility:visible;
        opacity: 1; */
        right: 50px;
        transform: rotate(0deg);
      }
        .header-li {
          position: relative;
          float: left;
          margin-right: 35px;
          line-height: 90px;
          white-space: nowrap;
          /* transition: all 1s; */
          color:#fff;
        }
        /* .header-li:hover {
          background: #fff;
          color: #222;
          height: 90px;
        } */
         .header-li::after {
          content: "";
          width: 0;
          height:2px;
          background-color: #fff;
          position: absolute;
          bottom: 2px;
          left: 0;
          transition: width .4s;
          /* box-sizing: border-box; */
        }
        .header-li:hover::after {
          width: 100%;
          transition: width .4s easy-in-out 1s;
        }
        /* .header-li::after :hover {
          width: 20px;
          border-color: black;
        } */
        .header-li a {
          height: 100%;
          position: relative;
          padding: 0 15px;
          cursor: pointer;

        }
        .header-li span {
          font-size: 16px;

        }
      .menuBtn {
        position:absolute;
        right: 700px;
        opacity: 0;
        top: 10px;
        visibility: hidden;
        height: 70px;
        width: 70px;
        transform: rotate(-45deg);
        transition: all .8s;
        border-radius: 50%;
        cursor: pointer;
        background: #fff;
        box-shadow: 0 4px 15px rgba(0,0,0,0.15);
        border: 0;
        text-align: center;
      }

</style>
