<template>
    <div class="wrapper">
    <holder></holder>

    <foot></foot>
    </div>
</template>

<script>
import holder from '@/components/header/header'
import foot from '@/components/foot/foot'
export default {
  name: 'eduClass',
  components: {
    holder,
    foot
  }

}
</script>

<style scoped>
* {
    padding: 0;
    margin: 0;
}
    .wrapper {
        height: 2000px;
        width: 100%;;
    }
</style>
