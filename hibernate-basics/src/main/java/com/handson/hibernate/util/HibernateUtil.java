package com.handson.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class HibernateUtil {

	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {

		if (sessionFactory == null) {
			return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		} else {
			return sessionFactory;
		}
	}
}
