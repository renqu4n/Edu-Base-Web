<template>
  <div>
    <div class="head" id="headNav">
      <div class="head-box" >
        <div class="logo">
          <img src="http://p6alxlphh.bkt.clouddn.com/logo1.png">
        </div>
        <ul class="header-right" id="wrapNav">
          <li class="header-li"><a><span>新闻资讯</span></a></li>
          <li class="header-li"><a><span>中心简介</span></a></li>
          <li class="header-li"><a><span>培训课程</span></a></li>
          <li class="header-li"><a><span>培训动态</span></a></li>
          <li class="header-li"><a><span>学员心声</span></a></li>
          <li class="header-li"><a><span>登录</span></a></li>
        </ul>
        <button id="menuBtn" class="menuBtn" @click="hiddenBtn()">菜单</button>
      </div>
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
    // 隐藏按钮
    hiddenBtn () {
      this.$get('menuBtn').style.opacity = 0
      this.$get('menuBtn').style.visibility = 'hidden'
      this.$get('menuBtn').style.position = 'absolute'
      this.$get('menuBtn').style.right = 500 + 'px'
      this.$get('menuBtn').style.transform = 'rotate(-45deg)'
      this.$get('headNav').style.position = 'fixed'
      this.$get('wrapNav').style.right = 50 + 'px'
      this.$get('wrapNav').style.transform = 'rotate(0deg)'
    },
    // 显示按钮
    showBtn () {
      this.$get('menuBtn').style.opacity = 1
      this.$get('menuBtn').style.visibility = 'visible'
      this.$get('menuBtn').style.position = 'fixed'
      this.$get('menuBtn').style.right = 170 + 'px'
      this.$get('menuBtn').style.outline = 'none'
      this.$get('menuBtn').style.transform = 'rotate(0deg)'
      this.$get('headNav').style.position = 'absolute'
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
    transition: all 2s;
    visibility:visible;
    opacity: 1;
  }
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
        transition: all 2.3s;
        visibility:visible;
        opacity: 1;
        right: 50px;
        transform: rotate(0deg);
      }
        .header-li {
          position: relative;
          float: left;
          margin-right: 35px;
          line-height: 90px;
          white-space: nowrap;
          transition: all 1s;
          color:#fff;
        }
        .header-li:hover {
          background: #fff;
          color: #222;
          height: 90px;
        }
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
        right: 500px;
        opacity: 0;
        top: 10px;
        visibility: hidden;
        height: 70px;
        width: 70px;
        transform: rotate(-45deg);
        transition: all 1.2s;
        border-radius: 50%;
        cursor: pointer;
        background: #fff;
        box-shadow: 0 4px 15px rgba(0,0,0,0.15);
        border: 0;
        text-align: center;
      }
</style>
