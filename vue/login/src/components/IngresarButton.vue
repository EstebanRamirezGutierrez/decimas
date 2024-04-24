<template>
    <ion-button type="submit" expand="block">{{ buttonText }}</ion-button>
  </template>
  
  <script>
  export default {
    name: 'IngresarButton',
    props: {
      buttonText: String
    }
  }
  </script>
  
  <style scoped>
  /* Agrega estilos si es necesario */
  </style>