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
                    <div class="teacher" v-for="teacitem of teacherList" :key="teacitem.id">
                        <div class="teacherBox">
                            <div class="teacherPhoto">
                                <span class="teacherFrame" id="teacherFrame"></span>
                                <img class="teacherImg" :src='teacitem.teacImg' >
                            </div>
                            <div class="teacherInfo">
                                <p>
                                    {{teacitem.teacName}}
                                    <span>{{teacitem.teacEname}}</span>
                                </p>
                                <p>{{teacitem.teacInfo}}</p>
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
      teacherList: [
        {
          'id': 1,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%A7%AC%E6%88%902.png',
          'teacName': '姬成',
          'teacEname': 'CHARLIE JI',
          'teacInfo': '现任北京丰立鼎盛投资有限公司投资顾问，iTutor Group商务顾问，原阿里巴巴UC移动事业群购物搜索项目负责人，兼任多所高校校企联合生涯规划师，曾累计在各高校开展100余场生涯规划讲座，累计培养数百名国际一线互联网精英。'
        },
        {
          'id': 2,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E9%99%88%E6%80%9D%E5%BD%A4.png',
          'teacName': '陈思彤',
          'teacEname': 'SITONG CHEN',
          'teacInfo': '特级讲师，原百度自然语言处理事业群 T6 级高级工程师，精通 Web 全栈、Java和 C++等技术，对设计模式，框架源码有很深的理解！'
        },
        {
          'id': 3,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%B8%B8%E7%AB%8B%E5%B3%B0.jpg',
          'teacName': '常立峰',
          'teacEname': 'LIFENG CHANG',
          'teacInfo': '高级讲师，美团商家广告推广部项目经理，美团 p7 工程师，原 58 赶集集团工程师，精通 web 全栈、数据库、C、 C++、Python、Android 和 javaEE 等技术。深厚的编程功底，与项目经验为你的工作面试保驾护航。'
        },
        {
          'id': 4,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%B0%B9%E6%96%87%E6%9D%BE4.png',
          'teacName': '尹文松',
          'teacEname': 'WENSONG YIN',
          'teacInfo': '高级讲师，滴滴出行平台技术部高级前端工程师，深入研究javascript，掌握丰富的实战编程经验，对不断更新的前端技术有独到的见解。教学严谨，致力于成为最优秀的知识传播者。'
        },
        {
          'id': 5,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%A7%AC%E6%88%902.png',
          'teacName': '姬成',
          'teacEname': 'CHARLIE JI',
          'teacInfo': '现任北京丰立鼎盛投资有限公司投资顾问，iTutor Group商务顾问，原阿里巴巴UC移动事业群购物搜索项目负责人，兼任多所高校校企联合生涯规划师，曾累计在各高校开展100余场生涯规划讲座，累计培养数百名国际一线互联网精英。'
        },
        {
          'id': 6,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E9%99%88%E6%80%9D%E5%BD%A4.png',
          'teacName': '陈思彤',
          'teacEname': 'SITONG CHEN',
          'teacInfo': '特级讲师， 原百度自然语言处理事业群 T6 级高级工程师，精通 Web 全栈、Java和 C++等技术，对设计模式，框架源码有很深的理解！'
        },
        {
          'id': 7,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%B8%B8%E7%AB%8B%E5%B3%B0.jpg',
          'teacName': '常立峰',
          'teacEname': 'LIFENG CHANG',
          'teacInfo': '高级讲师，美团商家广告推广部项目经理，美团 p7 工程师，原 58 赶集集团工程师，精通 web 全栈、数据库、C、 C++、Python、Android 和 javaEE 等技术。深厚的编程功底，与项目经验为你的工作面试保驾护航。'
        },
        {
          'id': 8,
          'teacImg': 'http://p6alxlphh.bkt.clouddn.com/teacher/%E5%B0%B9%E6%96%87%E6%9D%BE4.png',
          'teacName': '尹文松',
          'teacEname': 'WENSONG YIN',
          'teacInfo': '高级讲师，滴滴出行平台技术部高级前端工程师，深入研究javascript，掌握丰富的实战编程经验，对不断更新的前端技术有独到的见解。教学严谨，致力于成为最优秀的知识传播者。'
        }]
    }
  },
  components: {
    holder,
    foot
  },
  methods: {
    getX () {
      return Math.random() * 30
    },
    getY () {
      return Math.random() * 30
    }
  },
  mounted: function () {
    var teacherP = document.getElementsByClassName('teacher')
    for (let i = 0; i < teacherP.length; i++) {
      teacherP[i].addEventListener('mouseover', () => {
        document.getElementsByClassName('teacherFrame')[i].style.transform = 'translate3d(' + -this.getX() + 'px,' + -this.getY() + 'px,0px)'
        document.getElementsByClassName('teacherImg')[i].style.transform = 'translate3d(' + this.getX() + 'px,' + this.getY() + 'px,0px)'
      }, true)
    }
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
                    .teacherPhoto span {
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
                        transition: transform 2s;
                    }
                    .teacherImg {
                        width: 288px;
                        height: 346px;
                        transition: none;
                        transition: transform 2s;
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
