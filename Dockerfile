FROM openjdk:17
EXPOSE 9090
ADD target/spring-boot-ci-cd.jar spring-boot-ci-cd.jar
ENTRYPOINT [ "java","-jar","spring-boot-ci-cd.jar"]