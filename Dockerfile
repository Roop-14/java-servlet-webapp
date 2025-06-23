FROM tomcat:10.1-jre8
COPY target/DockerWebAppNew.war /usr/local/tomcat/webapps/My-docker-webapp.war
EXPOSE 8080
