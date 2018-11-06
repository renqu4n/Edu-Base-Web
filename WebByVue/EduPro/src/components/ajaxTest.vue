<template>
  <div class="hello">
    <!-- <button @click="a()">aaa</button> -->
    <!-- <a href="#">123</a>
    <ul>
      <li>{{results.name}}</li>
      <li>{{results.id}}</li>
      <li></li>
    </ul> -->
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App',
      results: ''
    }
  },
  methods: {
    // a () {
    //   let url = '/api/EduPro/test'
    // this.$ajax.get(url).then((response) => {
    //   this.results = response.data
    //   console.log(this.results)
    // }).catch(error => { console.log(error) })
    // }

  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
