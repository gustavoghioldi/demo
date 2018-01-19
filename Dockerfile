FROM java:8
EXPOSE 5000
COPY app.jar app.jar
CMD java -jar app.jar