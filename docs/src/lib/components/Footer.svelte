<script lang="ts">
	import { page } from '$app/stores';
</script>

<footer class="font-epilogue px-8 {$page.url.pathname === '/docs' ? 'bg-neutral-900' : 'bg-teal-950 bg-opacity-10'}">
	<div class="relative flex flex-col items-center py-16">
		<h1 class="text-3xl font-extrabold md:text-4xl xl:text-5xl text-center {$page.url.pathname === '/docs' ? 'text-neutral-100' : 'text-teal-950'}">
			Ready to get started?
		</h1>
		<p class="mt-4 text-lg font-light md:text-xl xl:text-2xl text-center {$page.url.pathname === '/docs' ? 'text-neutral-300' : 'text-teal-900'}">
			Join the community and start your journey today.
		</p>
		<div class="flex items-center gap-x-4">
			<button class="btn" type="button" disabled>Download</button>
			<a title="Documentation" href="/docs" class="btn bg-teal-900 hover:bg-teal-950">
				Learn More
			</a>
		</div>
	</div>
	<div
		class="flex items-center justify-between border-t border-t-slate-400 border-opacity-30 py-6 max-w-7xl m-auto {$page.url.pathname === '/docs' ? 'text-neutral-400' : 'text-teal-950'} text-sm md:text-base"
	>
		<p class="font-light">© 2023 NukaCraft</p>
		<p class="font-light text-right">
			This site is not affiliated with <a
				class="font-medium hover:underline {$page.url.pathname === '/docs' ? 'text-neutral-300' : 'text-teal-800'}"
				href="https://www.minecraft.net/en-us/article/meet-mojang-studios"
				target="_blank"
				title="Mojang Studios">Mojang Studios</a
			>
			or
			<a
				class="font-medium hover:underline {$page.url.pathname === '/docs' ? 'text-neutral-300' : 'text-teal-800'}"
				href="https://bethesda.net/en/dashboard"
				target="_blank"
				title="Bethesda Softworks">Bethesda Softworks</a
			>.
		</p>
	</div>
</footer>
