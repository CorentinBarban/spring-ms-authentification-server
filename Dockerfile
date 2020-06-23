FROM java:8
LABEL maintainer="corentin.barban@toulouse.miage.fr"
VOLUME /tmp
EXPOSE 9002
ADD target/oauth-authorization-server.jar oauth-authorization-server.jar
ENTRYPOINT ["java","-jar","oauth-authorization-server.jar"]
