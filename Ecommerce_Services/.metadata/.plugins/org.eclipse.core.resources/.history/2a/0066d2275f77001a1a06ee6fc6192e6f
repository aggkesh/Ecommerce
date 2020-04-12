FROM openjdk:13-jdk-alpine
LABEL maintainer="keshav.aggarwal@nagarro.com"
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar","/app.jar"]