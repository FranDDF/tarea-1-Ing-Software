# Proyecto Spring Boot + Docker

## PASOS:

1. **Descargar dependencias necesarias**  
   - Docker Desktop: https://www.docker.com/products/docker-desktop/  
   - Java Development Kit 17: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html  

2. **Crear el proyecto en Spring Boot**  
   - Ir a https://start.spring.io/  
   - Seleccionar:  
     - Project: Maven  
     - Language: Java  
     - Spring Boot: 3.5.0  
     - Packaging: Jar  
     - Java: 17  
     - Agregar dependencias: Spring Web, Spring Boot Dev Tools y Lombok  
   - Hacer clic en "Generate" para descargar el proyecto

3. **Crear una clase controladora**  
   - Crear un paquete llamado `controller`  
   - Dentro, crear una clase con un endpoint GET de prueba  
   - La aplicación se ejecuta por defecto en el puerto 8080  

4. **Generar el `.jar` del proyecto**  
   - Abrir la consola en la raíz del proyecto  
   - Ejecutar:  
     ```bash
     ./mvnw clean package
     ```  
   - El archivo `.jar` se generará dentro de la carpeta `target/`  

5. **Crear un archivo Dockerfile**  
   - En la raíz del proyecto, crear un archivo llamado `Dockerfile` con este contenido:  
     ```dockerfile
     FROM openjdk:17-jdk-slim
     COPY target/probandoGET-0.0.1-SNAPSHOT.jar app.jar
     ENTRYPOINT ["java", "-jar", "/app.jar"]
     ```

6. **Construir la imagen Docker**  
   - En la consola, en la raíz del proyecto, ejecutar:  
     ```bash
     docker build -t probando-get-app .
     ```

7. **Ejecutar el contenedor Docker**  
   - Ejecutar el contenedor con el siguiente comando:  
     ```bash
     docker run -p 8080:8080 probando-get-app
     ```

8. **Verificar en el navegador**  
   - Abrir `http://localhost:8080/api/hola`  
   - Si todo salió bien, vas a ver el mensaje del endpoint

