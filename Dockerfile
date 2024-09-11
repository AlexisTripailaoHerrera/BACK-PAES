# Usa una imagen de Maven para compilar el proyecto
FROM maven:3.8.4-amazoncorretto-8 AS build

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia los archivos del proyecto al contenedor
COPY pom.xml .
COPY src ./src

# Compila la aplicación y empaqueta el JAR
RUN mvn clean package -DskipTests

# Fase de producción: utiliza una imagen más liviana para correr el JAR
FROM amazoncorretto:8-alpine-jdk

# Copia el JAR generado desde la fase de compilación
COPY --from=build /app/target/BACK-PAES-0.0.1-SNAPSHOT.jar /app.jar

# Ejecuta el JAR
ENTRYPOINT ["java", "-jar", "/app.jar"]

