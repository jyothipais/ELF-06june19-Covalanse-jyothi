package com.covalense.hubernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private HibernateUtil() {
		
	}
	
	private static SessionFactory sessionFactory;

	public static SessionFactory buildSessionFactory() {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;

	}

}
