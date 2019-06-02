## Hibernate

### Data base installation steps
 * https://github.com/pramasamy65/hibernate/blob/master/SQL-Server-Installation-README.md
---
### Docker Starting steps for my-sql
* docker run -d --name sql_docker -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=myPassw0rd' -p 1433:1433 microsoft/mssql-server-linux
* docker ps -all
* docker rm container_id
* docker start sql_docker
* mssql -u sa -p myPassw0rd

* <property name="hibernate.connection.url">jdbc:mysql://localhost:1433/hibernate</property>
* <property name="hibernate.connection.username">sa</property>
* <property name="hibernate.connection.password">myPassw0rd</property>
---
### Sample DataBase Queries and script
 * https://github.com/pramasamy65/hibernate/blob/master/DataBase-Queries.md

### Hibernate Basics
 * https://github.com/pramasamy65/hibernate/blob/master/Hibernate-Notes1.md


---

* Add link to all README files

---