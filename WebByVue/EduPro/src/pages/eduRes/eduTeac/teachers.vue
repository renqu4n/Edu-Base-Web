<template>
    <div>
        <holder style="position:absolute;z-index:3;"></holder>
        <div class="body">
            <div class="teacPage">
                <div class="teacTitle">
                    <p>业界名师 卓尔不凡</p>
                    <span>互联网一线大咖亲授 祝您圆梦IT</span>
                </div>

                <div class="teacTable">
                    <div class="teacher" v-for="teacitem of teacherList" :key="teacitem.teacher_id" >
                        <div class="teacherBox">
                            <div class="teacherPhoto">
                                <span  ref="teacherFrame" class="teacherFrame" id="teacherFrame"></span>
                                <img ref="teacherImg" class="teacherImg" :src='teacitem.teacher_image' >
                            </div>
                            <div class="teacherInfo">
                                <p>
                                    {{teacitem.cName}}
                                    <span>{{teacitem.eName}}</span>
                                </p>
                                <p>{{teacitem.teacher_info}}</p>
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
  name: 'eduTeachers',
  data () {
    return {
      teacherList: []
    }
  },
  components: {
    holder,
    foot
  },
  methods: {
    handleTeacherData () {
      this.$axios.get('api/teacher/teacherShow.do').then(this.handleData)
    },
    handleData (res) {
      if (res.status === 200) {
        res = res.data
        for (let i in res) {
          this.teacherList.push(res[i])
        }
      } else {
        alert('请求失败，即将跳转到刚才的页面')
        this.$router.go('/')
      }
    },
    flash () {
    //   var teacherP = document.getElementsByClassName('teacherPhoto')
    //   console.log(teacherP.length)
    //   for (let i = 0; i < teacherP.length; i++) {
    //     console.log('进来了')
    //     teacherP[i].addEventListener('mouseover', () => {
    //       console.log('aaa')
      //   document.getElementsByClassName('teacherFrame')[0].style.transform = 'translate3d(' + -Math.random() * 30 + 'px,' + -Math.random() * 30 + 'px,0px)'
      //   document.getElementsByClassName('teacherImg')[0].style.transform = 'translate3d(' + Math.random() * 30 + Math.random() * 30 + 'px,0px)'
    //     }, true)
    //   }
    }
  },
  mounted () {
    this.handleTeacherData()
  }
}
</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
}
    .body {
        height:1765px;
        width: 100%;
        min-width: 1903px;
    }
        .teacPage {
            position: absolute;
            width: 100%;
            height: 1000px;
            top: 90px;
            z-index: 2;
        }
            .teacTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                margin-bottom: 56px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 40px;
            }
            .teacTitle span {
                font-size: 20px;
                color: #666;
            }
            .teacTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }
            .teacTable {
                margin: 70px auto;
                padding: 0 3px;
                width: 1320px;
                height: 100%;
                /* background: lightgreen; */
                position: relative;
            }
            .teacher {
                vertical-align: middle;
                width: 330px;
                height: 584px;
                box-sizing: border-box;
                float: left;
                margin-top: 30px;
            }
            .teacherBox {
                padding-right: 47px;
                cursor: pointer;
                float: left;
            }
                .teacherPhoto {
                    overflow: visible;
                    margin-top: 2.0832vw;
                    position: relative;
                }
                    .teacherFrame {
                        content: "";
                        display: block;
                        position: absolute;
                        left: 50%;
                        margin-left: -115px;
                        top: -28px;
                        width: 230px;
                        height: 100%;
                        border: 2px solid #c8c8c8;
                        box-sizing: border-box;
                        z-index: 2;
                        transition: transform 10s;
                        /* transform: translate3d(random(-30,-31)px,random(-30,-31)px,0) */
                    }
                    .teacherFrame:hover {
                        transform: rotate(720deg)
                    }
                    .teacherImg {
                        width: 288px;
                        height: 346px;
                        transition: none;
                        transition: transform 2s;
                        transform: translate3d(random(30,31)px,random(30,31)px,0)
                    }
                .teacherInfo {
                    position: relative;
                    padding-left: 14px;
                    margin-top: 55px;
                    transform: translateZ(0);
                }
                .teacherInfo::before {
                    content: '';
                    background: #dcdcdc;
                    box-sizing: border-box;
                    width: 1px;
                    position: absolute;
                    left: 0;
                    top: 0;
                    display: block;
                    height: 100%;
                }
                .teacherInfo:hover:before {
                    background: #000;
                    transform: scale3d(0, 0, 1) translateZ(0);
                    transition: transform 1s ease;
                    transform-origin: top center;
                    box-sizing: border-box;
                }
                .teacherInfo p:nth-child(1) {
                    font-size: 24px;
                    color: #222;
                    letter-spacing: .1em;
                    text-transform: uppercase;
                }
                .teacherInfo p:nth-child(1) span {
                    font-size: 16px;
                    margin-left: 20px;
                }
                .teacherInfo p:nth-child(2) {
                    font-size: 12px;
                    line-height: 18px;
                    color: #666;
                }
</style>
