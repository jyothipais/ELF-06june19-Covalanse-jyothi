package com.covalense.designpattern.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmployeeInfo;

public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {
	}

	public static SessionFactory buildSessionFactory() {
		return  new Configuration().configure().addAnnotatedClass(EmployeeInfo.class).buildSessionFactory();
	}

	private static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;

	}
	public static Session  openSession() {
		return getSessionFactory().openSession();
	}
}
