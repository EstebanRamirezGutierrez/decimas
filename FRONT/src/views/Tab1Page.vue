<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Shopping Card</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content :fullscreen="true">
      <ion-header collapse="condense">
        <ion-toolbar>
          <ion-title size="large">Blank</ion-title>
        </ion-toolbar>
      </ion-header>

      <div id="container">
        <strong>CARRO</strong>
        <ion-item>
          <ion-label position="stacked">ID</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">MARCA</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">MODELO</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">PLACA</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">COLOR</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">CATEGORIA</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-item>
          <ion-label position="stacked">CATEGORIA ID</ion-label>
          <ion-input v-model="Text" type="label"></ion-input>
        </ion-item>
        <ion-button @click="addItem()">Add COMPRA</ion-button>
        <ion-item v-if="itemSaved">
          Item guardado!
        </ion-item>
      </div>
    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { ref } from 'vue';
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar, IonItem, IonLabel, IonInput, IonTextarea, IonButton } from '@ionic/vue';

const itemName = ref('');
const expirationDate = ref('');
const description = ref('');
const itemSaved = ref(false);

function addItem() {
  console.log("Item Nombre:", itemName.value);
  console.log("Datos de expiración:", expirationDate.value);
  console.log("Descriptión:", description.value);

  setTimeout(() => {
    itemSaved.value = true;

    setTimeout(() => {
      itemSaved.value = false;
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

