## Hibernate-Notes1

### Java Persistence API (JPA)
 * https://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
 * https://huongdanjava.com/difference-between-jpa-and-hibernate-framework.html
 * It provides an object-relational mapping approach that lets you declaratively define how to map Java objects to relational database tables
 * All the data members of a JPA entity are considered persistent fields unless annotated with @Transient
 * JPA is a specification and several implementations are available. Popular implementations are Hibernate, EclipseLink and Apache OpenJPA
 * JPA permits the developer to work directly with objects rather than with SQL statements. The JPA implementation is typically called persistence provider
 * The mapping between Java objects and database tables is defined via persistence metadata
 * JPA metadata is typically defined via annotations in the Java class. Alternatively, the metadata can be defined via XML or a combination of both. 
 * A XML configuration overwrites the annotations
 
### Persistence Context
 * https://www.byteslounge.com/tutorials/container-vs-application-managed-entitymanager
 * Persistence Context is responsible for JPA entity management: When an application loads an entity from the database, the entity is in fact stored in the Persistence Context, so the entity becomes managed by the Persistence Context. Any further change made over that same entity will be monitored by the Persistence Context
 * The Entity Manager is an interface for the application to interact with the Persistence Context
 * Two distinct types of Persistence Context: Container Managed and Application Managed

### @Entity
 * A class which should be persisted in a database it must be annotated with javax.persistence.Entity & Such a class is called Entity
 * An entity represents a table in a relational database
 * @Entity(name = "Test") and name is the only property
 * public class Address {
	* If there is no name given for Entity then class name is treated as table name
	* If entity name is provided then hibernate create the table name as "Test"

### @Table
 * https://huongdanjava.com/learn-about-entity-and-table-annotation-in-jpa.html
 * Want to change the name of the database table to use in your application without changing the name of the entity, using @Table annotation will meet your needs
	* @Entity
	* @Table(name = "Test")
	* public class Clazz {
 * Here, the name of the table that we will use is the "Test" and the entity name is still Clazz.
 
### Hibernate SessionFactory vs. EntityManagerFactory
 * When the EntityManagerFactory is created, the persistence implementation searches for the META-INF/persistence.xml file in the classpath
 * SessionFactory uses hibernate.cfg.xml under resources folder
 * https://javabeat.net/jpa-entitymanager-vs-hibernate-sessionfactory/
 
### Difference between persistence.xml and hibernate.cfg.xml 
 * JPA leverages metadata from persistence.xml while Hibernate API uses hibernate.cfg.xml
 * Ideally both will have same set of informations which is used to connect the database
 * Want to start using JPA, you can reuse the existing configuration files by referencing the hibernate.cfg.xml in the persistence.xml
 * The properties set in persistence.xml will override the one in the defined hibernate.cfg.xml
 
## EntityManager
 * https://www.baeldung.com/hibernate-entitymanager

## Hibernate and JPA methods comparison
 * https://www.waitingforcode.com/hibernate/difference-between-sessionfactory-and-entitymanagerfactory/read

