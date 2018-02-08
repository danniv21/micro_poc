# Name:     claro-sales-order-api
# Time:     2017-05-07

FROM java:8-jre-alpine

MAINTAINER ddaa <danniv21@gmail.com>

RUN mkdir /app

WORKDIR /app

COPY claro-sales-order-api-1.0.0.jar /app

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/claro-sales-order-api-1.0.0.jar"]

EXPOSE 9000 9000