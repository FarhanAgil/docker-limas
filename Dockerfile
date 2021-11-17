FROM openjdk:8-jdk-alpine
MAINTAINER Moch_Farchan_Agil <1941720204@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Limas.java /java

# Compile file java
RUN javac Limas.java

# Running java
ENTRYPOINT java Limas