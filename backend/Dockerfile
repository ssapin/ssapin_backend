FROM openjdk:11-jre-slim
WORKDIR app
EXPOSE 8080
COPY ./build/libs/backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java $JAVA_OPTS -Duser.timezone=Asia/Seoul -jar ./app.jar
