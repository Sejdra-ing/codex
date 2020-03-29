FROM openjdk:11.0.6-jdk-slim

RUN addgroup --system spring && adduser --system spring
USER spring:spring
VOLUME /tmp
ADD build/libs/security-0.0.1-SNAPSHOT.jar app.jar
ADD build/resources/main/application.properties application.properties
EXPOSE $SERVER_PORT
EXPOSE $DEBUG_PORT
ENV JAVA_OPTS=""
ENV SPRING_PROFILES_ACTIVE=docker
ENTRYPOINT [ "sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE"  ]