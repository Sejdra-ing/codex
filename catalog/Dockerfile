FROM openjdk:11.0.6-jdk-slim

ENV JAVA_OPTS=""
ENV SPRING_PROFILES_ACTIVE=docker
ARG APP_VERSION="0.1.0-SNAPSHOT"

RUN addgroup --system spring && adduser --system spring
USER spring:spring
VOLUME /tmp
ADD build/libs/catalog-${APP_VERSION}.jar app.jar
ADD src/main/resources/application.yml application.yml
EXPOSE $SERVER_PORT
EXPOSE $DEBUG_PORT
ENTRYPOINT [ "sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE"  ]