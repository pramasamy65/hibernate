## Hibernate-Notes2


### Topic 1 : hibernate-basic Program using Config Files
 
 * Project : https://github.com/pramasamy65/hibernate/tree/master/hibernate-basics
 
 * https://github.com/pramasamy65/hibernate/blob/master/hibernate-basics/src/main/resources/hibernate.cfg.xml
 * Loading hibernate.cfg.xml directly in the Util program
 * https://github.com/pramasamy65/hibernate/blob/master/hibernate-basics/src/main/java/com/handson/hibernate/util/HibernateUtil.java
 * Getting SessionFactory using Util methods
 * https://github.com/pramasamy65/hibernate/blob/master/hibernate-basics/src/main/java/com/handson/hibernate_basics/module1/Demo1.java
 * Adding dependencies hibernate-core and mssql-jdbc, lombok
 * hibernate.cfg.xml configurations
	* <session-factory> hbm2ddl.auto is a hibernate configuration property
	* hbm2ddl.auto property of Hibernate either creates or validates a database table
	* <property name="hbm2ddl.auto">validate/create/update/create-drop</property>
   
	* Create - CREATE then the hibernate first drops the existing tables data and structure
	* Upate - If a table doesn’t exist then it creates new tables and where as if a column doesn’t exist it creates new columns for it
	* create-drop - Hibernate first checks for a table and do the necessary operations and finally drops the table after all the operations were completed
	* validate - Hibernate only validates the table structure- whether the table and columns have existed or not. If the table doesn’t exist then hibernate throws an exception
   
 ### Topic 2 : Spring With Hibernate Sample Program
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README2.md
 	* Configure DataSource in XML
 	* Configure SessionFactory in XML
 	* Use context:component-scan in XML
 	* Register HibernateDaoImpl as @Repository
 	* AutoWire SessionFactory and create session, transaction and make data base call



---
### Junk
* https://premaseem.wordpress.com/category/computers/framework/hibernate/

### Topics To be covered
* Hibernate and JPA methods
---
## Pending 
* Check all links in this file and add all links
### STEP 13 : Named Parameter JDBC Template **Refer : JdbcTemplateDaoImpl3.java**
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README1.md
 * https://github.com/pramasamy65/spring/blob/master/spring-data/README2.md
---