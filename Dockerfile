FROM tomcat:10.1-jdk17-temurin
COPY target/DockerWebAppNew.war /usr/local/tomcat/webapps/My-docker-webapp.war
EXPOSE 8080
