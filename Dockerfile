FROM openjdk:11.0.9
WORKDIR /home/app
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/home/app/app.jar"]

