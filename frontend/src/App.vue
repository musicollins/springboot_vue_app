<template>
  <div id="home">
    <h1>{{title}}</h1>
  </div>
</template>

<script>

export default {
  name: 'home',
  data(){
    return {
      title: ''
    }
  },
  mounted(){
    fetch("http://localhost:8085/")
    .then(response => {
      return response.text();
    })
    .then(data =>{
      this.title = data;
    })
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
