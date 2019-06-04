## Hibernate

### Data base installation steps
 * https://github.com/pramasamy65/hibernate/blob/master/SQL-Server-Installation-README.md
---
### Docker Starting steps for my-sql
* Open the Docker Application
* docker ps -all -> List all containers
* docker start sql_docker  -> Open SQL Application
* mssql -u sa -p myPassw0rd -> Connect to SQL Application
	* <property name="hibernate.connection.url">jdbc:mysql://localhost:1433/hibernate</property>
	* <property name="hibernate.connection.username">sa</property>
	* <property name="hibernate.connection.password">myPassw0rd</property>
---
### Sample DataBase Queries/Common Queries and script
 * https://github.com/pramasamy65/hibernate/blob/master/DataBase-Queries.md
 
### JDBC and Spring JDBC Concepts
 * Refer https://github.com/pramasamy65/spring/blob/master/spring-data/README1.md
 * Refer Steps 1 to 14 which contains JDBC and Spring JDBC Tempalte
 
### Hibernate Basics Concepts
 * https://github.com/pramasamy65/hibernate/blob/master/Hibernate-Notes1.md
 
## Hibernate Topics Covered : https://github.com/pramasamy65/hibernate/blob/master/Hibernate-Notes2.md

### Topic 1 : hibernate-basic Program using Config Files - Refer Hibernate-Notes2.md
### Topic 2 : Spring With Hibernate Sample Program - Refer Hibernate-Notes2.md

