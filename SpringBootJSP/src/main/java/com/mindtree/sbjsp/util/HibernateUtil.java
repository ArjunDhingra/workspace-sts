package com.mindtree.sbjsp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mindtree.sbjsp.model.Person;

public class HibernateUtil {
	private static SessionFactory factory;

	public static Session openSession() {
		Session session = null;
		try {
			factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class)
					.buildSessionFactory();
			session = factory.openSession();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		return session;
	}
}
