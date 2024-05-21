<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>CATEGORIA</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Tab 2</ion-title>
        </ion-toolbar>
      </ion-header>

      <ion-item>
        <ion-label position="stacked">ID</ion-label>
        <ion-input v-model="categoria.id" type="text"></ion-input>
      </ion-item>

      <ion-item>
        <ion-label position="stacked">Nombre</ion-label>
        <ion-input v-model="categoria.nombre" type="text"></ion-input>
      </ion-item>

      <ion-item>
        <ion-label position="stacked">Descripción</ion-label>
        <ion-input v-model="categoria.descripcion" type="text"></ion-input>
      </ion-item>

      <ExploreContainer name="Tab 2 page" />
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent, IonItem, IonLabel, IonInput } from '@ionic/vue';
import ExploreContainer from '@/components/ExploreContainer.vue';

const categoria = ref({
  id: '',
  nombre: '',
  descripcion: ''
});
</script>
