<script lang="ts">
	import '../app.css';
</script>

<main
	class="w-full h-screen bg-black flex flex-col lg:flex-row items-center overflow-x-clip"
>
	<div
		class="relative flex justify-center flex-col font-epilogue lg:w-1/2 mt-44 md:w-4/5 lg:mt-0 z-10 lg:h-full lg:pl-20 xl:pl-28 lg:fade-bg"
	>
		<h1
			class="font-extrabold text-4xl md:text-6xl lg:text-7xl text-neutral-50 drop-shadow-lg text-center lg:text-left 3xl:text-8xl px-8"
		>
			NukaCraft, explore the wasteland
		</h1>
		<p
			class="text-lg mt-2 md:text-2xl md:mt-4 lg:text-3xl font-normal text-neutral-100 drop-shadow-md text-center 3xl:text-4xl lg:text-left px-8"
		>
			Learn, build, and survive in the wasteland with a new Fallout <span class="font-bold text-3xl"
				>+</span
			> Minecraft experience
		</p>
	</div>
	<div class="relative nuka-bg mx-auto w-96 h-3/5 z-[3] lg:scale-125 overflow-hidden lg:translate-y-12 lg:-rotate-6 normal-mask 3xl:big-mask 3xl:translate-y-28"></div>
	<div class="absolute left-0 top-0 h-[60%] w-full bg-gradient-to-b from-black to-teal-950 dim-mask lg:bright-mask">
		<div class="poster-bg w-full bg-cover lg:bg-contain"></div>
	</div>
	<div class="absolute left-0 bottom-0 h-[40%] w-full water-perspective overflow-hidden mix-blend-screen">
		<div class="w-full h-full mix-blend-overlay z-[1] absolute bg-gradient-to-t from-teal-950 to-teal-400"></div>
		<div class="water-bg"></div>
	</div>
</main>
<!--<div class="h-20 absolute w-full bottom-0 -translate-y-[2rem] lg:top-0 lg:-translate-y-[6rem]">-->
<!--  <svg id="visual" class="fill-amber-500" viewBox="0 0 900 600" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1">-->
<!--    <path d="M0 438L30 438.2C60 438.3 120 438.7 180 446.3C240 454 300 469 360 474.8C420 480.7 480 477.3 540 472.2C600 467 660 460 720 449.2C780 438.3 840 423.7 870 416.3L900 409L900 601L870 601C840 601 780 601 720 601C660 601 600 601 540 601C480 601 420 601 360 601C300 601 240 601 180 601C120 601 60 601 30 601L0 601Z" stroke-linecap="round" stroke-linejoin="miter"></path>-->
<!--  </svg>-->
<!--</div>-->

<svelte:head>
	<title>NukaCraft | Home</title>
</svelte:head>

<style>
	.nuka-bg {
		background-image: url('/NukaColaAnimation.gif');
		background-size: contain;
		background-repeat: no-repeat;
		background-position: center;
		image-rendering: pixelated;
	}

	.poster-bg {
		background-image: url('/darkNuka.png');
		height: 100%;
		filter: blur(4px);
		background-repeat: repeat-x;
		image-rendering: pixelated;
		background-position: center;
		animation: move 120s linear infinite;
		/* shadow on the bottom */
		box-shadow: inset 0px -120px 120px -120px rgba(0, 0, 0, 0.6);
	}

	.water-bg {
		background-image: url('/NukaQuantumWater.png');
		height: 100%;
		background-repeat: repeat;
		transform: scale(8) skewX(45deg) rotateX(85deg);
		transform-origin: top;
		image-rendering: pixelated;
		animation: water 20s linear infinite;
		/* shadow on the top */
		box-shadow: inset 0px 200px 180px -50px rgba(0, 0, 0, 0.8);
		filter: saturate(0.4) hue-rotate(5deg) brightness(0.9);
	}

	.water-perspective {
		perspective: 34vh;
	}

	@keyframes water {
		from {
			background-position: 0 0;
		}
		to {
			background-position: 156px 156px;
		}
	}

	@keyframes move{
		from { background-position: 0 0; }
		to { background-position: 917px 0; }
	}
</style>
