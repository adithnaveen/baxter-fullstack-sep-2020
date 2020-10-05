FROM openjdk:11
ADD target/userapp.jar app.jar
EXPOSE 8002
ENTRYPOINT ["java", "-Xms1536m", "-Xmx2536m",  "-jar", "app.jar"]


