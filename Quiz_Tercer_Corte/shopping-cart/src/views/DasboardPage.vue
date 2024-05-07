<template>
  <ion-page>
    <ion-header :translucent="true">
      <ion-toolbar>
        <ion-title>Dashboard</ion-title>
      </ion-toolbar>
    </ion-header>

    <ion-content>
      <br>
      <div id="container">
        <strong><a href="/cliente">Ir a Clientes</a></strong>
        <br>
        <strong><a href="/producto">Ir a productos</a></strong>
        <br>
        <strong><a href="/pais">Ir a pais</a></strong>
        <br>
        <strong><a href="/departamento">Ir a departamento</a></strong>
        <br>
        <strong><a href="/ciudad">Ir a ciudad</a></strong>

      </div>

    </ion-content>
  </ion-page>
</template>

<script setup lang="ts">
import { IonContent, IonHeader, IonPage, IonTitle, IonToolbar } from '@ionic/vue';
</script>

<style scoped></style>
