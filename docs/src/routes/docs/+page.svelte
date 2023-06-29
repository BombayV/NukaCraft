<script lang="ts">

import DocsLink from "$lib/components/DocsLink.svelte";
</script>

<main class="relative min-h-screen w-full flex flex-col items-center py-32 font-epilogue bg-neutral-950 px-8">
  <div class="text-neutral-100 flex-col flex items-center mx-auto max-w-7xl">
    <h1 class="font-black text-4xl md:text-5xl">Documentation</h1>
    <p class="text-neutral-300 mt-2 lg:text-lg mb-8">Learn more about NukaCraft and how to use it in your minecraft server.</p>
    <div class="flex flex-col gap-y-8 w-full">
      <DocsLink linkTo="/docs/armor" image="https://wallpaperaccess.com/full/2438323.jpg" title="Armor" description="Learn how to use the armor system in NukaCraft." />
      <DocsLink linkTo="/docs/armor" image="https://wallpaperaccess.com/full/2438323.jpg" title="Armor" description="Learn how to use the armor system in NukaCraft." />
      <DocsLink linkTo="/docs/armor" image="https://wallpaperaccess.com/full/2438323.jpg" title="Armor" description="Learn how to use the armor system in NukaCraft." />
      <DocsLink linkTo="/docs/armor" image="https://wallpaperaccess.com/full/2438323.jpg" title="Armor" description="Learn how to use the armor system in NukaCraft." />
    </div>
  </div>
</main>
