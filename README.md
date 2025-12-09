# tailwindspring




```sh
npm init -y
npm install -D tailwindcss@3
npx tailwindcss init
npx tailwindcss -i ./src/main/resources/static/css/input.css -o src/main/resources/static/css/style.css
npx update-browserslist-db@latest
npx tailwindcss -i ./src/main/resources/static/css/input.css -o src/main/resources/static/css/style.css
npx tailwindcss -i ./src/main/resources/static/css/input.css -o src/main/resources/static/css/style.css --watch
npm run tawilwind:watch
npm run tailwind:watch

```

```json
...
 "scripts": {
    "test": "echo \"Error: no test specified\" && exit 1",
    "tailwind:watch": "tailwindcss -i ./src/main/resources/static/css/input.css -o src/main/resources/static/css/style.css --watch",
    "tailwind:deploy": "tailwindcss -i ./src/main/resources/static/css/input.css -o src/main/resources/static/css/style.css --minify"
  
  },
...
```

Execução simples:

```sh
npm run tailwind:watch & ./mvnw spring-boot:run
```