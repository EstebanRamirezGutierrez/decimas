<template>
    <ButtonComponent id="created" value="Agregar" expand="full" color="primary" />
    <ButtonComponent id="updated" value="Modificar" expand="full" color="secondary" />
    <ButtonComponent id="deleted" value="Eliminar" expand="full" color="success" />
    <ButtonComponent id="find" value="Consultar" expand="full" color="danger" />
</template>

<script setup lang="ts">
import ButtonComponent from '@/components/ButtonComponent.vue';
</script>

<style scoped src="../theme/container.css"></style>
