<template>
    <div>
        <div class="foot">
            <div class="main-footer container">
                <div class="row">
                    <img src="" alt="">
                    <div class="culture">OUR CULTURE
                        <br>
                        <br>我们的介绍
                        <div class="culture-intro">我们不会辜负时代赋予我们的历史性机遇，为构建技术互联的超科技世界，一往无前。在这里，愿我们拥有更多可能，也期待你们脚下有风，各自灿烂。</div>
                    </div>
                    <div class="categoris">
                        CATEGORIS
                        <ul class="categoris-table">
                          <li><a href="">Bootstrap官网</a></li>
                          <li><a href="">JQuery官网</a></li>
                          <li><a href="">Vue官网</a></li>
                          <li><a href="">React官网</a></li>
                          <li><a href="">Webpack官网</a></li>
                          <li><a href="">Node官网</a></li>
                        </ul>
                    </div>
                    <div class="qrcode">
                        <div class="leftqr">
                            <a href=""><img src="..\..\assets\qr.jpg" alt=""></a>
                        </div>
                        <div class="leftword">我们的公众号</div>
                        <div class="rightqr">
                            <a href=""><img src="..\..\assets\qr.jpg" alt=""></a>
                        </div>
                        <div class="rightword">咨询我们</div>
                    </div>
                </div>
            </div>
            <div class="copyright">Copyright 2018 BY RZQ</div>
        </div>
    </div>
</template>

<script>
export default {
  name: 'foot'
}
</script>

<style>
* {
    margin: 0;
    padding: 0;
    list-style: none;

}
a {
    text-decoration: none;
}
    .foot {
        height: 563px;
        margin-top: -563px;
        width: 100%;
        min-width: 1300px;
        background: #222;
    }
        .main-footer {
            padding-top:142px;
            color: #fff;
            margin: 0 auto;
        }
        .container {
            width:1170px;
        }
            .row {
                margin-left: 15px;
                margin-right: 15px;
                width: 100%;
                height: 421px;
                position: relative;
                font-size: 16px;
            }
                .culture {
                    height: 401px;
                    width: 280px;
                    padding-bottom:20px;
                    padding-right: 100px;
                    float: left;
                    /* border: 1px solid white; */
                    position: relative;
                }
                    .culture-intro {
                        height: 351px;
                        position: absolute;
                        bottom: 0;
                        width: 270px;
                    }
                .categoris {
                    height: 100%;
                    width: 280px;
                    float: left;
                    /* margin-left: 50px; */
                    color: #fff;
                    /* border: 1px solid white; */
                }
                    .categoris-table{
                        font-size: 16px;
                        position: absolute;
                        top: 30px;
                    }
                    .categoris-table li {
                        margin-top: 10px;
                    }
                .categoris .categoris-table a {
                    text-decoration: none;
                    color: #fff;
                }
                .qrcode {
                    width: 400px;
                    right: 50px;
                    position: absolute;
                    height: 100%;
                    float: left;
                    /* border: 1px solid white; */
                }
                .qrcode img {
                    width: 140px;
                    height: 140px;
                    cursor: pointer;
                }
                    .leftqr {
                        position: absolute;
                        left: 0;
                        top: 0;
                        width:140px;
                        height: 140px;
                    }
                    .leftword {
                        position: absolute;
                        left: 0;
                        top: 160px;
                        width: 140px;
                        text-align: center;
                        font-size: 14px;
                    }
                        .leftqr a {
                            cursor: default;
                        }
                    .rightqr {
                        position: absolute;
                        right: 0;
                        top: 0;
                        height: 140px;
                        width: 140px;
                    }
                    .rightword {
                        position: absolute;
                        top: 160px;
                        right: 0;
                        width: 140px;
                        text-align: center;
                        font-size: 14px;
                    }
                        .leftqr a {
                            cursor: default;
                        }
        .copyright {
            height: 82px;
            width: 100%;
            line-height: 82px;
            text-align: center;
            font-size: 14px;
            color: #fff;
            background: #111;
            position: absolute;
        }
</style>
