# InterfaceSegregation
      The Interface Segregation Principle represent the "I" of the five SOLID Principle of OOPs.It is defined as,the
client should not be force to depend on the interface which they do not use.An Interface is a set of abstraction that a
class can implement it.
       In these Project,suppose in a burger place customer can order a burger, fries or a combo of both.Since  customer
cannot order burger ,fries,or combo from a single interface.To implement a burger-only order,we are forced to throw an 
exception in the other method. Similarly,for a fries-only order,we need to throw an exception in other two.Similarly,
for combo.So for all three class(Burger,Fries,Combo) make three seperate interfaces which can be esy to use.

The Problems Of Interface Segregation Principle:
       Client developers are confused by methods which don't need.Maintenance becomes harder because of side effects,
a  chnge in an interface forces to change classes that don't implement the interface.
   
JunitTest:
     There is Junit Test for all the type of Interface Segregation Principle and test coverage in jacoco report is 100% 
successful.

SONARQUBE 

gradle command to publish code to SonarQube
gradlew sonarqube 
  -Dsonar.projectKey=InterfaceSegregation 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=1fa14e7c8b2934aad0e4bcd64b3175d5308f09fb