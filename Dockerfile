FROM tomcat:8.0.51-jre11-alpine
COPY ./target/makemytrip*.jar /usr/local/tomcat/webapps
EXPOSE  8080
USER makemytrip
WORKDIR /usr/local/tomcat/webapps
CMD ["catalina.sh","run"]