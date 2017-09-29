# SodingJavaAssignment

# Project Title: SodingJavaAssignment

# Description:

The project is an authentication system that validates user for accessing the system only when they have input correct password. The project involves three levels of user authentication. There are varieties of password systems available, many of which have failed due to bot attacks while few have sustained it but to a limit. In short, almost all the passwords available today can be broken to a limit. Hence this project is aimed to achieve the highest security in authenticating users.

Roles tend to be attached to identities, as you don't authenticate a role, but you authenticate an identity. You can authorize an identity, and you can authorize a role. 



| human |===>| User |===>| Role |===>| permission |



# Advantages

•	The system is user-friendly and has simple interface.

•	Provides strong security against bot attacks or hackers.

•	Protects systems vulnerable to attacks.

# User access policy

# Super Admin 

	Can add/edit/delete user 

# Admin 

	Can edit User 

	Unable to add/delete any user information

# User 

	Only view user details 

	Not permit add/edit/delete any user information. 

# Anonymous User 

	Unable to view anything 

# Following technologies being used

•	Spring 4.3.0.RELEASE

•	Hibernate Core 4.3.10.Final

•	validation-api 1.1.0.Final

•	hibernate-validator 5.1.3.Final

•	MySQL Server 5.6

•	Maven 3

•	JDK 1.8

•	Tomcat 8.0.21

•	Eclipse 

# How to run/deploy

Step1: Restore/run database script sql

 Step2: change database configuration at application.propertices file under resource file 

 Right Click on Project -> Run As -> Maven Build...

Add Goals: clean install. Click Apply and Run

Tomcat Server in Servers tab then follow steps to add Apache Tomcat to Eclipse.

 Deploy project to Apache Tomcat and start tomcat.

# http://localhost:8080/SodingJavaAssignment/login

#----------------------Screens------------

#Login screen

#Login failed screen

#Super Admin Dashboard screen

#User Registration Form screen

#Admin Dashboard screen

#User Dashboard screen

#Super Admin User screen

#Anonymous User Dashboard screen

#Registration Form screen

#Logout screen
 
