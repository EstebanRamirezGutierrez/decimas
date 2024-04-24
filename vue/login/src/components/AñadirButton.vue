<template>
  <input type="text" :placeholder="placeholderText" v-model="inputValue">
</template>

<script>
export default {
  name: 'AñadirInput',
  props: {
    placeholderText: {
      type: String,
      default: 'Ingrese aquí'
    }
  },
  data() {
    return {
      inputValue: ''
    };
  }
}
</script>

<style scoped>
/* Agrega estilos si es necesario */
</style>