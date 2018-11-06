FROM openjdk:10-jre-slim
VOLUME /tmp
ENV JAR_FILE /project-web/target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","--add-modules","java.xml.bind", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]