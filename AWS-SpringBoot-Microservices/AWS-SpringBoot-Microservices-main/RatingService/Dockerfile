FROM openjdk:19
EXPOSE 80
ADD target/RatingService.jar RatingService.jar
# HEALTHCHECK CMD curl --fail http://127.0.0.1:80/ || exit 1
HEALTHCHECK --interval=5m --timeout=5s CMD curl -f http://127.0.0.1:80/actuator/health/ || exit 1
ENTRYPOINT ["java","-jar","/RatingService.jar"]