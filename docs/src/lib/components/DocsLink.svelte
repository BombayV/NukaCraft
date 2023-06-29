<script lang="ts">
  export let linkTo: string;
  export let image: string;
  export let title: string;
  export let description: string;
</script>

<a class="w-full h-32 md:h-40 relative bg-red-500 rounded-xl overflow-clip flex flex-col items-center justify-center border-4 group drop-shadow-md shadow-md border-teal-600" href={linkTo}>
  <img class="w-full object-center object-cover absolute" src={image} alt={title} />
  <span class="w-full h-full absolute top-0 left-0 rounded-xl backdrop-blur bg-black bg-opacity-30 group-hover:bg-opacity-60 transition duration-200"></span>
  <p class="text-white text-xl md:text-2xl font-extrabold z-10">{title}</p>
  <p class="text-white text-center text-sm lg:text-lg z-10">{description}</p>
</a>