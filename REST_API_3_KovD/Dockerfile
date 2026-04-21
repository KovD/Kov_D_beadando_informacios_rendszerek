FROM tomcat:9-jre17-temurin

RUN rm -rf /usr/local/tomcat/webapps/*

COPY target/REST_API_3_KovD-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]