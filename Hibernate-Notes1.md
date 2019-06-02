## Hibernate-Notes1

### Project - hibernate-basics
 * https://github.com/pramasamy65/hibernate/tree/master/hibernate-basics
 
#### Package - com.handson.hibernate_basics.module1
 * Adding dependencies hibernate-core and mssql-jdbc
 * hibernate.cfg.xml configurations
   * <session-factory> hbm2ddl.auto is a hibernate configuration property
   * hbm2ddl.auto property of Hibernate either creates or validates a database table
   * <property name="hbm2ddl.auto">validate/create/update/create-drop</property>
   
   * Create - CREATE then the hibernate first drops the existing tables data and structure
   * Upate - If a table doesn’t exist then it creates new tables and where as if a column doesn’t exist it creates new columns for it
   * create-drop - Hibernate first checks for a table and do the necessary operations and finally drops the table after all the operations were completed
   * validate - Hibernate only validates the table structure- whether the table and columns have existed or not. If the table doesn’t exist then hibernate throws an exception
   
* Java Persistence API (JPA)
 * https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
 * It provides an object-relational mapping approach that lets you declaratively define how to map Java objects to relational database tables
 * All the data members of a JPA entity are considered persistent fields unless annotated with @Transient
 * JPA is a specification and several implementations are available. Popular implementations are Hibernate, EclipseLink and Apache OpenJPA
 * JPA permits the developer to work directly with objects rather than with SQL statements. The JPA implementation is typically called persistence provider
 * The mapping between Java objects and database tables is defined via persistence metadata
 * JPA metadata is typically defined via annotations in the Java class. Alternatively, the metadata can be defined via XML or a combination of both. 
 * A XML configuration overwrites the annotations

* @Entity
 * A class which should be persisted in a database it must be annotated with javax.persistence.Entity & Such a class is called Entity
 * An entity represents a table in a relational database
 * This name parameter is used to refer to the entity in queries
 * By default, the table name corresponds to the class name. You can change this with the addition to the annotation @Table(name="NEWTABLENAME").

* @Table
 * 
 
 https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
 https://huongdanjava.com/learn-about-entity-and-table-annotation-in-jpa.html
 https://premaseem.wordpress.com/category/computers/framework/hibernate/