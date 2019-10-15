# Spring React

A quick boilerplate code snippet integrating Spring Data REST with React as described in the tutorial linked [here.](https://spring.io/guides/tutorials/react-and-spring-data-rest/)

Initialized with Spring Initializr.

Requires JDK 8, NodeJS, and Maven to run.

To run locally use:

```
./mvnw spring-boot:run 
```

in the project folder.

To shutdown, send a POST request to the "/actuator/shutdown"