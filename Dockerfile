FROM amazoncorretto:17-alpine3.21
LABEL version='1.0.0' maintainer='santiagoberrio@gmail.com' description='Ejemplo Docker + Spring Boot'
WORKDIR /app
COPY *.jar app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "app.jar"]