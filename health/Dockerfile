FROM openjdk:latest
RUN apt-get update
RUN  apt-get install -y gradle
ADD . .
RUN gradle build
CMD ["java", "-jar", "build//libs/projectname-0.1.0.jar" ]