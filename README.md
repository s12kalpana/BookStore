Technologies Used in developing Full stack application for Storing and displaying Books 

Model Name:Book
Attributes:
	title:string,
	isbn:long,
	author:string,
	yearOfPublishing:string,
	numOfPages:int
	
Book Service:
	1.Initial data has been setup using DatabaseLoader class
	2.Able to search the book by title and isbn
	
	2.Displaying list of available books
	3.Create & Delete options
	4.Displaying the list based on page size and navigation

Framework Details:
	Spring Data Rest
	JPA using hibernate
	H2 Database
	
Dependencies:
	spring-boot-starter-data-rest
	spring-boot-starter-data-jpa
	h2
	spring-boot-starter-test
	spring-boot-starter-thymeleaf
	
plugins:
	frontend-maven-plugin
	maven-surefire-plugin
	
Java Version: 1.8

REST API Level 3 (HATEOS)

Frontend:

Nodes.js & React


Classes & Test Cases written includes-
Book
BookRepository
BookController
DataBaseLoader
