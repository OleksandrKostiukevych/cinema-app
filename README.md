# Cinema-app
___
## Description
Cinema App is a RESTful web application that supports user authentication,<br>
authorization and CRUD operations. Created using Java Spring & Hibernate.

## Structure
| Module            |                 Description                 |
|-------------------|:-------------------------------------------:|
| *main/java/*      |
| config            |     configuration of Spring & Hibernate     |
| dao               |        crud operations with database        |
| dto               |   classes for http requests and responses   |
| exception         |              custom exceptions              |
| lib               |         email & password validation         |
| model             |            classes for entities             |
| service           |               business logic                |
| util              |  DataInitializer & class for parsing date   |
| *main/resources/* |
| db.properties     | file with database and Hibernate properties |
| *main/* pom.xml  |        dependencies & other settings        |

## Used technologies
Java 17, Spring Web MVC, Spring Security, Hibernate, MySQL, Tomacat 9, Maven
## How to run the application?
- Install Intellij IDEA, JDK 17 or higher, MySQL and TomCat 9 on your computer<br>
- Clone this repository with command in termanal:<br>
`git clone git@github.com:OleksandrKostiukevych/cinema-app.git`<br>
and open it in your IDE<br>
- Configure MySQL properties in the file resources/db.properties<br>
(username, password, driver and url)<br>
- Add Tomcat configuration<br>
- Start Tomcat and try the app
