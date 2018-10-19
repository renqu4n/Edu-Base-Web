<template>
<div style="" id="fullScreen">
    <holder></holder>
    <div class="body"></div>
    <foot></foot>
</div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'

export default {
  name: 'index',
  data () {
    return {
    }
  },
  components: {
    holder,
    foot
  },
  methods: {
  }
}
</script>

<style>
  * {
    margin: 0;
    padding: 0;
  }
  .body{
    height: 2000px;
    width: 100%;
  }

</style>
