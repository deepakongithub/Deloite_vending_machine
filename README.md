#  project for Spring Boot VendingMachine 

 
 
## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

 
```shell
mvn spring-boot:run
```

## UML diagram

 diagram
 
- [Controller](VendingMachine/src/main/resources/static/Controller.gif)
- [Model](VendingMachine/src/main/resources/static/model_uml.gif)
- [Service](VendingMachine/src/main/resources/static/Service.gif)
 

## API END POINT

- [list of accepted Conis : http://localhost:8080/Conis ](http://localhost:8080/Conis)
- [list of Products available   : http://localhost:8080/Products/](http://localhost:8080/Products/)
- [buy product  API : http://localhost:8080/Products/buy/{id}/{_coin} ](http://localhost:8080/Products/buy/11/PENNY)



## H2 BD details 

- [db dashboard http://localhost:8080/h2-console/](http://localhost:8080/h2-console/)


- Username : root
- Password : password
- DB name:   vending_db