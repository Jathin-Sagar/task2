#FROM openjdk:11-jre-slim
#RUN apt-get update && apt-get install -y iputils-ping
#WORKDIR /app
#COPY target/springapp-0.0.1-SNAPSHOT.jar /app/app.jar

#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
COPY target/spring-0.0.1-SNAPSHOT.jar /app/app.jar
#COPY target/spring-0.0.1-SNAPSHOT.jar /app/app.jar
#COPY /var/lib/jenkins/workspace/spring\ pipeline/target/spring-0.0.1-SNAPSHOT.jar /app/app.jar
#COPY /var/lib/jenkins/workspace/springpipeline/target/spring-0.0.1-SNAPSHOT.jar /app/app.jar
#ADD /var/lib/jenkins/workspace/spring pipeline/target/spring-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]
