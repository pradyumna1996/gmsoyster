FROM openjdk:11
MAINTAINER bpb.com
COPY target/gymapi-0.0.1-SNAPSHOT.jar gymapiserver-1.0.0.jar
ENTRYPOINT ["java","-jar","/gymapiserver-1 .0.0.jar"]