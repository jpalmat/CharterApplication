FROM openjdk:8
ADD target/jimmyapp-0.0.1-SNAPSHOT.jar jimmyapp-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "jimmyapp-0.0.1-SNAPSHOT.jar"]