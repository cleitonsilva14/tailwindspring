/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["src/main/resources/templates/**/*.html"],
  theme: {
    extend: {
      colors: {
        red: {
          1:"#e12a28"
        }
      }
    },
  },
  plugins: [],
}

