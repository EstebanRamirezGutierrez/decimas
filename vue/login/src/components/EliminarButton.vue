<template>
    <ion-button type="submit" expand="block">{{ buttonText }}</ion-button>
  </template>
  
  <script>
  export default {
    name: 'EliminarButton',
    props: {
      buttonText: String
    }
  }
  </script>  
  <style scoped>
  .eliminar-button {
  background-color: #ff5733; 
  color: #ff5733; 
  font-size: 1.2em; 
}
  </style>