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
### Sample DataBase Queries and script
 * https://github.com/pramasamy65/hibernate/blob/master/DataBase-Queries.md

### JDBC and Spring JDBC Concepts
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README1.md

### Hibernate Basics
 * https://github.com/pramasamy65/hibernate/blob/master/Hibernate-Notes1.md
 


---
## Pending 
* Check all links in this file and add all links
### STEP 13 : Named Parameter JDBC Template **Refer : JdbcTemplateDaoImpl3.java**
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README1.md
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README2.md
---