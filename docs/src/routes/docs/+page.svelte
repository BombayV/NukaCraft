<script lang="ts">
import DocsLink from "$lib/components/DocsLink.svelte";
import Footer from "$lib/components/Footer.svelte";
</script>

<main class="relative min-h-screen w-full flex flex-col items-center py-32 font-epilogue bg-neutral-950 px-8">
  <div class="text-neutral-100 flex-col flex items-center mx-auto max-w-7xl">
    <h1 class="font-black text-4xl md:text-5xl">Official Documentation</h1>
    <p class="text-neutral-300 mt-2 lg:text-lg mb-8">Learn more about NukaCraft and all of its features in the Wasteland.</p>
    <div class="flex flex-col gap-y-8 w-full">
      <DocsLink linkTo="/docs/armor" image="https://wallpaperaccess.com/full/2438323.jpg" title="Armor" description="Find out how to use the armor system and where to find it." />
      <DocsLink linkTo="/docs/items" image="https://wallpaperaccess.com/full/2438323.jpg" title="Items" description="Discover all the possible items available in NukaCraft." />
      <DocsLink linkTo="/docs/pipboy" image="https://wallpaperaccess.com/full/2438323.jpg" title="PipBoy" description="Learn how to use your new PipBoy as you explore the wasteland." />
      <DocsLink linkTo="/docs/weapons" image="https://wallpaperaccess.com/full/2438323.jpg" title="Weapons" description="Find the best weapons that suit your playstyle." />
    </div>
  </div>
</main>
<Footer />