<script lang="ts">
  import { marked } from "marked";
  import ArmorDocs from '$lib/data/armor.md?raw';
</script>

<main class="relative min-h-screen bg-neutral-950 h-full py-32 px-8">
  <article class="prose prose-invert mx-auto font-epilogue">
    {@html marked(ArmorDocs)}
  </article>
  <a href="/docs" title="Docs" class="btn px-4 mx-auto absolute left-1/2 -translate-x-1/2">Back to Documentation</a>
</main>
