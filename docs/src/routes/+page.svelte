<script lang="ts">
	import '$lib/styles/tailwind.css';
	import Footer from '$lib/components/Footer.svelte';
	import Welcome from "$lib/components/Welcome.svelte";
	import Landing from "$lib/components/Landing.svelte";
</script>

<Landing />
<Welcome />
<Footer />

<svelte:head>
	<title>NukaCraft | Home</title>
</svelte:head>