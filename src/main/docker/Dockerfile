FROM openjdk:11

VOLUME /tmp
COPY fonts/* /usr/share/fonts/
ADD maven-demo*.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
EXPOSE 9090

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar >> /opt/logs/maven-demo.log" ]