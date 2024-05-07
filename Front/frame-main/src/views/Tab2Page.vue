<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Información del Empleado</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Blank</ion-title>
        </ion-toolbar>
      </ion-header>

      <div id="container">
        <strong>Ingrese la Información del Empleado</strong>
        <ion-item>
          <ion-label position="stacked">Nombre del Empleado</ion-label>
          <ion-input v-model="nombreEmpleado" placeholder="Ingrese el nombre del empleado"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">Cargo del Empleado</ion-label>
          <ion-input v-model="cargoEmpleado" placeholder="Ingrese el cargo del empleado"></ion-input>
        </ion-item>
        <ion-button @click="guardarEmpleado()">Guardar Empleado</ion-button>
        <ion-item v-if="empleadoGuardado">
          ¡Información del Empleado Guardada!
        </ion-item>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonItem, IonLabel, IonInput, IonButton } from '@ionic/vue';

const nombreEmpleado = ref('');
const cargoEmpleado = ref('');
const empleadoGuardado = ref(false);

function guardarEmpleado() {
  console.log("Nombre del Empleado:", nombreEmpleado.value);
  console.log("Cargo del Empleado:", cargoEmpleado.value);
  
 
  setTimeout(() => {
    empleadoGuardado.value = true;
   
    setTimeout(() => {
      empleadoGuardado.value = false;
    }, 3000);
  }, 1000);
}
</script>

<style scoped>
#container {
  text-align: center;
  
  position: absolute;
  left: 0;
  right: 0;
  top: 50%;
  transform: translateY(-50%);
}

#container strong {
  font-size: 20px;
  line-height: 26px;
}

#container ion-item {
  margin-bottom: 15px;
}
</style>