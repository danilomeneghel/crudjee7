# Products

Project of register Products developed with Java EE.

## Features

- CRUD
- MVC
- ORM
- EJB
- JPA
- JSF

## Requirements

- NetBeans 8.2
- Java EE
- Glassfish = 4.1
- MySql >=5

## Tecnologies

- Java
- CSS
- JS
- MySql

## Installation

```
$ git clone https://github.com/danilomeneghel/crudjee7.git

$ cd crudjee7

```

Then create a database with name crud_jee in your mysql. You can find database dump in crud_jee.sql, import it:

```
$ mysql -u <your user> -p <your password>

mysql> create database `crud_jee`;

mysql> use `crud_jee`;

mysql> source crud_jee.sql

```

## Glassfish Configuration

1- Create the Java EE project (Enterprise Application) without creating any new classes.
2- After, click on "Clean and Build Project". When successful, click on "Run Project".
This will cause Glassfish to start.
3- Now open the Glassfish by accessing the browser:
http://localhost:4848/

Go to "Resources/JDBC/JDBC Connection Pools", create the connection to the database (pool).
Note: When creating the Pool it is necessary to put the connection data with mysql, but the password can not be empty (create a new user with a password).

Then go to "Resources/JDBC/JDBC Resources", create a name for "jndi" (CrudJEE7) and select the previously created pool.

After you finish configuring, just open NetBeans and run the project in the browser.
http://localhost:8080/crudjee7-war/

## License

Office is licensed under <a href="LICENSE">The MIT License (MIT)</a>.

## Screenshots

![Screenshots](screenshots/screenshot01.png)<br><br>
![Screenshots](screenshots/screenshot02.png)<br><br>
![Screenshots](screenshots/screenshot03.png)<br><br>
![Screenshots](screenshots/screenshot04.png)<br><br>