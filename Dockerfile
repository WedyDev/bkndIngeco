FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/bkndIngeco-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} bkndIngeco.jar
ENTRYPOINT ["java","-jar","/bkndIngeco.jar"]