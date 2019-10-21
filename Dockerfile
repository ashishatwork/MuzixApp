FROM openjdk:11
ADD ./target/Muzix-0.0.1-SNAPSHOT.jar /usr/src/Muzix-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","Muzix-0.0.1-SNAPSHOT.jar"]
