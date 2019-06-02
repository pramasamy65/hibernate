package com.handson.hibernate_basics.module1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.handson.hibernate.util.HibernateUtil;
import com.handson.hibernate_basics.module1.vo.Address;

/**
 * Hello world!
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Address address = new Address("180 ELM CT", "Sunnyvale", "California", 94089);
		session.save(address);
		session.getTransaction().commit();
	}
}
