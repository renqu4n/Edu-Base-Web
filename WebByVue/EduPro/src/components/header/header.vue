<template>
  <div class="wrapper">
    <div class="head head-show" id="headNav"  style="z-index:998">
      <div class="head-box" >
        <div class="logo">
          <router-link to="/"><img src="..\..\assets\logo.png"></router-link>
        </div>
        <ul class="header-right" id="wrapNav" >
          <router-link to="/"><li class="header-li"><a><span>首页</span></a></li></router-link>
          <router-link to="/eduNews"><li class="header-li"><a><span>新闻资讯</span></a></li></router-link>
          <router-link to="/eduCenter"><li class="header-li"><a><span>中心简介</span></a></li></router-link>
          <li class="selected" id="selectCtrl" @mouseover="showSelect()" @mouseout="hiddenSelect()">
            <a><span>教学资源</span></a>
            <div id="select">
              <router-link to="/eduRes/eduTeac"><a class="options" href="#" title="师资力量">师资力量</a></router-link>
              <router-link to="/eduRes/eduReso"><a class="options" href="#" title="培训资源">培训资源</a></router-link>
            </div>
          </li>
          <router-link to="/eduHeart"><li class="header-li"><a><span>学员心声</span></a></li></router-link>
          <li class="header-li" v-if="login"><a href="login.html"><span>登录</span></a></li>
          <li class="header-li" v-if="loginStatus">
            <span>欢迎你<a class="userName" alt="点击名字注销" href="outLogin.do">{{user}}</a></span>
          </li>
        </ul>

      </div>
      <button id="menuBtn" class="menuBtn" @click="hiddenBtn()"  style="z-index:999">菜单</button>
    </div>
  </div>
</template>
<script>

export default {
  name: 'holder',
  data () {
    return {
      scrollTop: null,
      loginHtml: '',
      loginStatus: false,
      login: true,
      userName: ''
    }
  },
  prop: {
    user: String
  },
  mounted () {
    // window.location.reload(true)
    // 控制当屏幕滚动超过90px时，隐藏菜单栏
    this.clearAllCookie()
    this.checkLogin()
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
    this.userName = this.$global.user
  },
  methods: {
    // 清空cookie
    clearAllCookie () {
      var keys = document.cookie.match(/[^ =;]+(?==)/g)
      if (keys) {
        for (var i = keys.length; i--;) { document.cookie = keys[i] + '=0;expires=' + new Date(0).toUTCString() }
      }
    },
    // 获取用户登录名
    checkLogin () {
      // location.reload(true)
      this.$axios.get('/Edu-ssm/getLoginUser.do').then(this.getName)
    },
    // 获取登录的用户名
    getName (res) {
      if (res.status === 200) {
        res = res.data[0]
        if (res == null) {
        } else {
          this.user = res.user_name
          this.login = false
          this.loginStatus = true
        }
      } else {
        alert('请求失败！即将返回上个页面！')
      }
    },
    outLogin () {
      // this.$axios.get('/Edu-ssm/outLogin.do').then(this.$router.push({path: `/`}))
      this.$axios({
        method: 'GET',
        URL: '/Edu-ssm/outLogin.do',
        cache: false
      })
    },
    // 隐藏按钮、显示导航栏
    hiddenBtn () {
      var menuBtn = this.$get('menuBtn')
      menuBtn.style.opacity = 0
      menuBtn.style.visibility = 'hidden'
      menuBtn.style.position = 'absolute'
      menuBtn.style.right = 700 + 'px'
      menuBtn.style.transform = 'rotate(-45deg)'
      this.$get('headNav').style.position = 'fixed'
      this.$get('wrapNav').style.right = 50 + 'px'
      this.$get('wrapNav').style.transform = 'rotate(0deg)'
    },
    // 显示按钮、隐藏顶部导航栏
    showBtn () {
      var menuBtn = this.$get('menuBtn')
      menuBtn.style.opacity = 1
      menuBtn.style.visibility = 'visible'
      menuBtn.style.position = 'fixed'
      menuBtn.style.right = 170 + 'px'
      menuBtn.style.outline = 'none'
      menuBtn.style.transform = 'rotate(0deg)'
      this.$get('headNav').style.position = 'absolute'
      this.$get('wrapNav').style.right = 200 + 'px'
      this.$get('wrapNav').style.transform = 'rotate(1deg)'
    },
    // 教学资源下的下拉框显示隐藏功能
    showSelect () {
      this.$get('select').style.height = 100 + 'px'
    },
    hiddenSelect () {
      this.$get('select').style.height = 0 + 'px'
    }
  }
  // 监听登录名变化 ,
  // watch: {
  //   userName (str, oldstr) {
  //   }
  // }
}
</script>

<style scoped>
* {
  margin: 0;
  padding: 0;
  list-style: none;
  text-decoration: none;
}
a {
  color: #fff
}

  .head {
    width: 100%;
    height: 90px;
    min-width: 1903px;
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
          margin-right:35px;
          line-height: 90px;
          white-space: nowrap;
          color:#fff;
        }

        /* 这里是实现教学资源的下拉框 */
        /* start */
        .selected {
          position: relative;
          float: left;
          margin-right: 35px;
          line-height: 90px;
          color:#fff;
          overflow: hidden;
          cursor: default;
        }
        .selected div {
          height: 0;
          width: 64px;
          background: #222;
          transition: all .8s;
          line-height: 20px;
          font-size: 13px;
          line-height: 50px;
          text-align: center;

        }
        .options {
            display: inline-block;
            height: 50px;
            width: 100%;
            color: #fff;
        }
        .options:hover {
            background:#555;
        }
        /* End  */

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
          transition: width .4s;
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
          cursor: pointer;
        }
        .userName {
          color:honeydew;
          font-size: 20px;
          margin-left: 5px;
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
        text-align: center
      }

</style>
