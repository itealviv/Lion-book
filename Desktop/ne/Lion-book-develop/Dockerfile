FROM openjdk:8-jdk-alpine
# Environment Variable that defines the endpoint of sentiment-analysis python api.
ADD target/Store-book-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
CMD ["java", "-jar", "Store-book-0.0.1-SNAPSHOT.jar"]