# THE MARS ROVER CHALLENGE :rocket:
A java application to run with maven

## The following dependencies was used to build the application:
| Dependecie | Version |
| ------ | ------ |
| Java | 1.8u221 |
| Maven | 3.6.2 |
| Spring Tool Suite 3 (IDE) | 3.9.9.RELEASE |


## Usage
The application read the **rovers.txt** file to input the data:
```
5 5         //Upper-right coordinate
1 2 N       //1º rover coordinates and orientation
LMLMLMLMM   //1º rover serie of movements for the rover exploration
3 3 E       //2º rover coordinates and orientation
MMRMMRMRRM  //2º rover serie of movements for the rover exploration
```
And will have the next output:
```
1 3 N       //1º rover final coordinates and orientation
5 1 E       //2º rover final coordinates and orientation
```
### To test, compile and run use:
```sh
$ cd marsrover
$ mvn clean package
$ java -cp target/marsrover-0.0.1-SNAPSHOT.jar fsoto1.marsrover.App
```

### To only test:
```sh
$ cd marsrover
$ mvn clean test
```

### Downloads
Direct links to download the dependencies (if you don't have already)

| Dependency | URL |
| ------ | ------ |
| JDK 8 | https://www.oracle.com/cl/java/technologies/javase/javase-jdk8-downloads.html |
| MVN | https://maven.apache.org/download.cgi |