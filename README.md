# tarea-1-Ing-Software

PASOS:

1- Descargar Docker para desktop: https://www.docker.com/products/docker-desktop/ y el Java Development Kit 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
2- Crear el proyecto en Spring Boot desde https://start.spring.io/, en el apartado Project seleccionar Maven, en la sección de Language, seleccionar Java y la versión de Spring Boot 3.5.0. En el apartado de Project Metadata, nombrar los campos. En Packaging, seleccionar Jar y por último, en Java seleccionar 17. Agregar las dependencias de Spring web, Spring Boot Dev Tools y Lombok. Como paso final, generar el proyecto
3- Crear un package llamado Controller y dentro del mismo, crear una clase con nombre a definir. En la misma, agregar un endpoint de tipo GET
4- Se ejecuta en el puerto 8080 por defecto
5- Generar el .jar dentro del directorio del proyecto
6- Crear un archivo llamado Dockerfile, debe contener lo siguiente:
FROM openjdk:17-jdk-slim
COPY target/probandoGET-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
7-Desde la consola, ejecutar "docker build -t probando-get-app ." para construir la imagen en Docker
8- Correr el contenedor, ejecutando "docker run -p 8080:8080 probando-get-app"
