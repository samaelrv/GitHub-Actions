FROM  openjdk:17
LABEL authors="Administrator"
EXPOSE 8080
ADD target/springboot-github-actions.jar springboot-github-actions.jar
ENTRYPOINT ["java", "-jar", "/springboot-github-actions.jar"]