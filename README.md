# How to Set up Redis Sentinel with Spring Boot & MySql

## Redis Setup

In this example we have set up 1 Master node 2 slaves and 2 sentinel nodes

In the customer service we are using MYSQL as Database

## Building Service Image

* Build customer service image

* Update the image path in [docker-compose.yaml](https://github.com/kuldeepsingh99/redis-sentinel/blob/master/docker-compose.yaml#L75)

## Run

* Copy all [redis-sentinel](https://github.com/kuldeepsingh99/redis-sentinel/tree/master/redis-sentinel) folder and docker-compose.yaml file to any directory

* We need to execute this SQL to create Table

