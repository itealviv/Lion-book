FROM frolvlad/alpine-oraclejdk8

EXPOSE 8080

ENV GROOVY_VERSION=2.4.5.4
RUN mkdir "/usr/lib/groovy" && \
    wget "http://repo1.maven.org/maven2/com/github/igor-suhorukov/groovy-grape-aether/$GROOVY_VERSION/groovy-grape-aether-$GROOVY_VERSION.jar" -O /usr/lib/groovy/groovy-grape-aether.jar

ENTRYPOINT ["java","-jar","/usr/lib/groovy/groovy-grape-aether.jar"]

CMD ["--help"]