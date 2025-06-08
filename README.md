# tarea-1-Ing-Software

PASOS:

1- Crear el proyecto en Spring Boot
2- Agregar un endpoint de tipo GET
3- Se ejecuta en el puerto 8080 por defecto
4- Generar el .jar dentro del directorio del proyecto
5- Crear un archivo llamado Dockerfile, debe contener lo siguiente:
FROM openjdk:17-jdk-slim
COPY target/probandoGET-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
6-Desde la consola, ejecutar "docker build -t probando-get-app ." para construir la imagen en Docker
7- Correr el contenedor, ejecutando "docker run -p 8080:8080 probando-get-app"
