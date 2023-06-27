<nav
	class="w-screen fixed z-50 flex flex-col lg:flex-row justify-between items-center px-8 py-4 bg-transparent"
>
	<a title="Home" href="/" class="font-brush text-5xl drop-shadow-lg text-teal-50">NukaCraft</a>
	<div
		class="flex items-center justify-between gap-x-6 font-epilogue font-semibold text-xl text-neutral-50 mt-4 lg:mt-0"
	>
		<a
			title="Download the mod from Modrinth"
			href="https://modrinth.com/mod/nukacraft"
			target="_blank"
			class="transition-colors duration-300 hover:text-teal-100 drop-shadow">Download</a
		>
		<a
			title="Check out the documentation/wiki"
			href="/docs"
			target="_blank"
			class="transition-colors duration-300 hover:text-teal-100 drop-shadow">Docs</a
		>
		<a
			title="Contribute to the mod"
			href="https://github.com/BombayV/NukaCraft"
			target="_blank"
			class="transition-colors duration-300 hover:text-teal-100 drop-shadow">GitHub</a
		>
	</div>
</nav>

<slot />
