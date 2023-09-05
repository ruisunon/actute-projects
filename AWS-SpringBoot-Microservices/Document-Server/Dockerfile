FROM openjdk:19
EXPOSE 80
ADD target/DocumentService.jar DocumentService.jar
HEALTHCHECK --interval=5m --timeout=5s CMD curl -f http://127.0.0.1:80/actuator/health/ || exit 1
ENTRYPOINT ["java","-jar","/DocumentService.jar"]