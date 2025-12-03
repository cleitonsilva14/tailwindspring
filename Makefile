tailwind-watch:
	npm run tailwind:watch

spring-dev:
	mvnw spring-boot:run

dev:
	make -j 2 tailwind-watch spring-dev