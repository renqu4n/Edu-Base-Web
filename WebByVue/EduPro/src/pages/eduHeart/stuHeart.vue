<template>
    <div>
    <holder style="position:absolute;z-index:3;"></holder>
    <div class="body">
      <swiper style="position:absolute;z-index:1;">
      </swiper>
      <div class="heartPage">
        <div class="heartTitle">
          <p>学员心声</p>
          <span>桃李不言，下自成蹊</span>
        </div>
      </div>
    </div>
    <foot></foot>
    </div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
import swiper from './components/heartSwiper'
import { quillEditor } from 'vue-quill-editor'
export default {
  name: 'eduClass',
  components: {
    holder,
    foot,
    swiper,
    quillEditor
  },
  data () {
    return {
    }
  },
  methods: {
  }
}
</script>

<style>
* {
  padding: 0;
  margin: 0;
}
.body {
  height:3195px;
  width: 100%;
}
.heartPage {
            position: absolute;
            width: 100%;
            height: 1000px;
            top: 1180px;
            z-index: 2;
        }
            .heartTitle {
                height: 170px;
                width: 100%;
                padding-top: 90px;
                margin-bottom: 56px;
                /* background: rebeccapurple; */
                text-align: center;
                font-size: 40px;
            }
            .heartTitle span {
                font-size: 20px;
                color: #666;
            }
            .heartTitle span::after {
                content: "";
                display: block;
                margin: 30px auto 0;
                width: 20px;
                height: 2px;
                background: #be926f;
            }

</style>
