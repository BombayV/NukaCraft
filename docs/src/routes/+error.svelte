<script lang="ts">
  import '$lib/styles/tailwind.css';
  import { page } from '$app/stores';
</script>

<main class="relative min-h-screen w-full bg-neutral-950 font-epilogue flex flex-col items-center justify-center px-8 poster-bg">
  <span class="absolute h-full w-full top-0 left-0 backdrop-blur-sm"></span>
  <h1 class="font-black text-9xl drop-shadow-md text-teal-50 flick-anim z-50">
    {$page.status}
  </h1>
  <h2 class="font-medium text-3xl text-teal-50 flick-anim z-50 mt-4">{$page.error.message}</h2>
  <a href="/" class="btn z-50">
    Go to Homepage
  </a>
</main>

<style>
  .poster-bg {
    background-image: url('/darkNuka.png');
    background-size: cover;
    background-repeat: no-repeat;
    image-rendering: pixelated;
    background-position: center;
  }

  .flick-anim {
    animation: pulsate 0.11s ease-in-out infinite alternate;
  }

  @keyframes pulsate {
    100% {
      text-shadow: 0 0 4px #fff,
      0 0 11px #fff,
      0 0 19px #fff,
      0 0 40px rgb(13 148 136),
      0 0 80px rgb(13 148 136),
      0 0 90px rgb(13 148 136),
      0 0 100px rgb(13 148 136),
      0 0 150px rgb(13 148 136);
    }

    0% {
      text-shadow: 0 0 4px #fff,
      0 0 10px #fff,
      0 0 18px #fff,
      0 0 38px rgb(13 148 136),
      0 0 78px rgb(13 148 136),
      0 0 88px rgb(13 148 136),
      0 0 98px rgb(13 148 136),
      0 0 148px rgb(13 148 136);

    }
  }
</style>