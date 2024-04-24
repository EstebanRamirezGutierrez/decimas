<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title class="ion-text-center">LOGIN</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <form @submit.prevent="onSubmit">
        <ion-item>
          <ion-label position="floating">User name</ion-label>
          <ion-input type="text" required v-model="user" />
        </ion-item>
        <ion-item>
          <ion-label position="floating">Password</ion-label>
          <ion-input type="password" required v-model="password" />
        </ion-item>
        <IngresarButton buttonText="INGRESAR" />
        <SalirButton buttonText="SALIR" />
        <AñadirButton buttonText="AÑADIR" />
        <UpdateButton buttonText="UPDATE" />
        <EliminarButton buttonText="ELIMINAR" />
      </form>

      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Blank</ion-title>
        </ion-toolbar>
      </ion-header>

      <div id="container">
        <strong>Ready to create an app?</strong>
        <p>Start with Ionic <a target="_blank" rel="noopener noreferrer" href="https://ionicframework.com/docs/components">UI Components</a></p>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonItem, IonLabel, IonInput, IonButton } from '@ionic/vue';
import { defineComponent, ref } from 'vue'; 

// Importar los componentes de los botones
import IngresarButton from './IngresarButton.vue';
import SalirButton from './SalirButton.vue';
import AñadirButton from './AñadirButton.vue';
import UpdateButton from './UpdateButton.vue';
import EliminarButton from './EliminarButton.vue';

defineComponent({
  name: 'HomePage',
  components: {
    IonContent, 
    IonHeader, 
    IonPage, 
    IonTitle, 
    IonToolbar, 
    IonItem, 
    IonLabel, 
    IonInput, 
    IonButton,
    // Agregar los componentes de los botones al registro de componentes
    IngresarButton,
    SalirButton,
    AñadirButton,
    UpdateButton,
    EliminarButton
  }
});

const user = ref('');
const password = ref('');
const onSubmit = () => {
  if (user.value === "admin" && password.value === "19950206") {
    alert('Ha iniciado correctamente');
  } else {
    alert('Datos incorrectos basura');
  }
};
</script>

<style scoped>
/* Agrega estilos si es necesario */
</style>