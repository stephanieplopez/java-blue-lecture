<template>
    <div class="main">
        <h2>Product Review {{ productName }}</h2>
        <p class="description">{{ description }}</p>
    </div>
</template>

<style scoped>
div.main {
    margin: 1rem 0;
}
</style>

<script>
export default {
<<<<<<< HEAD
    // What needs to be exported (COMMA), these are key value pairs
    name: 'product-review',
    // Putting in variables, must return a JavaScript object
    data() {
        return {
            // One way databinding
=======
    name: 'product-review',
    data() {
        return {
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
            productName: "Cigar Parties for Dummies",
            description: "Host and plan the perfect cigar party for all your squirrelly friends."
        }
    }
<<<<<<< HEAD
}
</script>

=======

}
</script>
>>>>>>> 8b78e057775d418691169d51503e72c097c95e20
