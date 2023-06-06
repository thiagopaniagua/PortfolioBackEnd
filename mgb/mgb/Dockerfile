FROM gradle:jdk1
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY gradle ./gradle
COPY src ./src
RUN gradle build
EXPOSE 8080
CMD ["java", "-jar", "build/libs/mgb-0.0.1-SNAPSHOT-plain"]