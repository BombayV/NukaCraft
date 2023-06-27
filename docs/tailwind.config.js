/** @type {import('tailwindcss').Config} */
export default {
	mode: 'jit',
	content: ['./src/**/*.{html,js,svelte,ts}'],
	theme: {
		extend: {
			fontFamily: {
				epilogue: ['Epilogue'],
				brush: ['BrushScript']
			},
			screens: {
				xs: '320px',
				'3xl': '1920px'
			}
		}
	},
	plugins: []
};
