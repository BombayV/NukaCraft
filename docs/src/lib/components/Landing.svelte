<main class="w-full custom-h relative flex flex-col lg:flex-row items-center overflow-x-clip">
  <div
      class="relative flex justify-center flex-col font-epilogue lg:w-1/2 mt-44 md:w-4/5 lg:mt-0 z-10 lg:mb-40 lg:h-full lg:pl-20 xl:pl-28 lg:fade-bg"
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
  <div
      class="relative nuka-bg mx-auto w-96 h-3/5 z-[3] lg:scale-125 overflow-hidden lg:translate-y-12 lg:-rotate-6 normal-mask 3xl:big-mask 3xl:translate-y-28"
  />
  <div
      class="absolute left-0 top-0 h-[48%] w-full bg-gradient-to-b from-red-950 to-teal-700 dim-mask lg:bright-mask"
  >
    <div class="poster-bg w-full bg-cover lg:bg-contain shadow-md drop-shadow-md" />
  </div>
  <div class="absolute left-0 bottom-0 h-[52%] w-full water-perspective overflow-hidden">
    <div
        class="w-full h-full mix-blend-overlay z-10 absolute bg-gradient-to-t from-teal-950 to-teal-400"
    />
    <div class="water-bg" />
  </div>
  <div class="absolute w-full bottom-0 lg:-bottom-10 z-10">
    <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320" class="w-full fill-teal-50">
      <path
          fill-opacity="1"
          d="M0,128L40,149.3C80,171,160,213,240,224C320,235,400,213,480,197.3C560,181,640,171,720,192C800,213,880,267,960,266.7C1040,267,1120,213,1200,192C1280,171,1360,181,1400,186.7L1440,192L1440,320L1400,320C1360,320,1280,320,1200,320C1120,320,1040,320,960,320C880,320,800,320,720,320C640,320,560,320,480,320C400,320,320,320,240,320C160,320,80,320,40,320L0,320Z"
      />
    </svg>
  </div>
</main>

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
    box-shadow: inset 0px -12vh 12vh -12vh rgba(0, 0, 0, 0.8);
  }

  .water-bg {
    background-image: url('/NukaQuantumWater.png');
    height: 100%;
    background-repeat: repeat;
    transform: scale(8) skewX(45deg) rotateX(82deg);
    transform-origin: top;
    image-rendering: pixelated;
    animation: water 20s linear infinite;
    /* shadow on the top */
    box-shadow: inset 0px 20vh 20vh -5vh rgba(0, 0, 0, 0.8);
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

  @keyframes move {
    from {
      background-position: 0 0;
    }
    to {
      background-position: 917px 0;
    }
  }
</style>
