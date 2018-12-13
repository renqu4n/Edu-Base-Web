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
          <li class="header-li" v-if="login"><a href="login.html"><span title="点击登录">登录</span><img src="../../assets/未登录.png" class="avatar1" title="你还没有登录哦"></a></li>
          <li class="header-li" v-if="loginStatus"  @mouseover="showUser()" @mouseout="hiddenUser()">
            <span>欢迎你，{{userName}}
              <!-- 头像 -->
              <img src="../../assets/登录.png" class="avatar2">
            </span>
            <!-- <a class="userName" alt="点击名字注销" href="outLogin.do"></a> -->
            <ul class="userCenter" id="userCenter">
              <li @click="openUpdatePwd()"><a><img src="../../assets/修改密码.png" alt=""><span>修改密码</span></a></li>
              <li><a href="/Edu-ssm/back_manager.jsp"><img src="../../assets/后台.png" alt=""><span>回到后台</span></a></li>
              <li @click="outLogin()"><img src="../../assets/退出.png" alt=""><span>注销</span></li>
            </ul>
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
      loginStatus: false, // 默认为未登录
      login: true, // 登录后为false
      userCenter: false, // 用户下拉选项框
      userName: '' // 用户名
    }
  },
  prop: {
    user: String
  },
  mounted () {
    // window.location.reload(true)
    // 控制当屏幕滚动超过90px时，隐藏菜单栏
    this.checkLogin()
    this.clearAllCookie()
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
    // 清空cookie
    clearAllCookie () {

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
        console.log(res)
        if (res == null) {
        } else {
          this.userName = res.user_name
          this.login = false
          this.loginStatus = true
          // this.openLoginSuc()
        }
      } else {
        alert('请求失败！即将返回上个页面！')
      }
    },
    // 登录成功后弹出欢迎框
    // openLoginSuc () {
    //   this.$notify({
    //     title: '登录成功',
    //     message: '欢迎回来,' + this.userName,
    //     type: 'success',
    //     position: 'bottom-right'
    //   })
    // },
    // 弹出修改密码框
    openUpdatePwd () {
      this.$prompt('请输入旧密码', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        inputErrorMessage: '密码格式不正确'
      }).then(({ value }) => {
        this.$message({
          type: 'success',
          message: '修改密码成功'
        })
        this.$axios({
          method: 'POST',
          URL: '/Edu-ssm/updateUserPermission.do',
          data: value
        })
      }).catch(() => {
        this.$message({
          type: 'info',
          message: '取消修改密码'
        })
      })
    },
    outLogin () {
      var choose = confirm('你确定要注销吗？')
      if (choose === true) {
        this.$axios.get('/Edu-ssm/outLogin.do').then(() => {
          this.loginUser = false
          window.location.reload()
        })
      } else {
        this.$router.push('/')
      }
      // this.$axios({
      //   method: 'GET',
      //   URL: '/Edu-ssm/outLogin.do',
      //   cache: false
      // })
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
    },
    showUser () {
      // this.userCenter = true
      this.$get('userCenter').style.opacity = 1
    },
    hiddenUser () {
      // this.userCenter = false
      this.$get('userCenter').style.opacity = 0
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
        /* .header-li:last-child::after {
          display: none;
        } */
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
        .header-li:nth-child(6)::after {
          display: none;
        }
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
        #userCneter::after{
          display: none;
        }
        /* 头像 */
        .avatar1 {
          width: 40px;
          height: 40px;
          border-radius: 50%;
          vertical-align: middle;
          margin-left: 10px;
        }
        .avatar2 {
          width: 40px;
          height: 40px;
          border-radius: 50%;
          vertical-align: middle;
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
      .userCenter {
        margin: 0;
        padding: 0;
        background:#222;
        opacity: 0;
        transition: opacity .4s;
      }
      .userCenter li {
        width: 100%;
        line-height: 40px;
        height: 40px;
        cursor: pointer;
      }
      .userCenter li a {
        margin: 0;
        padding: 0;
      }
      .userCenter li:hover{
        background:#555;
      }
      .userCenter li:nth-child(1) img {
        width: 30px;
        height: 30px;
        vertical-align: middle;
      }
       .userCenter li:nth-child(1) span {
         padding-left: 5px;
         text-align: center
       }
      .userCenter li:nth-child(2) img {
        width: 25px;
        height: 25px;
        vertical-align: middle;
        margin-left: 2px;
      }
       .userCenter li:nth-child(2) span {
         padding-left: 7px;
         text-align: center
       }
      .userCenter li:nth-child(3) img {
        width: 25px;
        height: 25px;
        vertical-align: middle;
        margin-left: 2px;
      }
       .userCenter li:nth-child(3) span {
         padding-left: 7px;
         text-align: center
       }
</style>
