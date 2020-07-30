FROM java:8
VOLUME /tmp
ADD microservice-platform-admin-0.0.1-SNAPSHOT.jar microservice-platform-admin.jar
RUN bash -c 'touch /microservice-platform-admin.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/microservice-platform-admin.jar"]