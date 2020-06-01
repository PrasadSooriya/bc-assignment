# Weather Application
## This Java standalone application shows weather forecast of a particular location in the USA.

### How to build application
Use maven clean compile

### How to run application
mvn -q clean compile exec:java -Dexec.mainClass="com.prasad.demo.Forecaster" -Dexec.args="40.695606,-75.190751"
Note: The run time argument should be a latitude and longitude pair seperated by a comma
