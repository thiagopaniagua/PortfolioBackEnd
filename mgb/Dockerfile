FROM  adoptopenjdk:11-jre-hotspot
WORKDIR /mgb
COPY build/libs/mgb-0.0.1-SNAPSHOT.jar mgb.jar
RUN gradle build
EXPOSE 8080
CMD ["java", "-jar", "build/libs/mgb-0.0.1-SNAPSHOT.jar"]
ENTRYPOINT ["java","-jar","/mgb.jar"]