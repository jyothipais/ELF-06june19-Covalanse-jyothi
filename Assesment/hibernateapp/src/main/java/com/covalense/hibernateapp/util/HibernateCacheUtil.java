package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.bean.EmployeeInfoBean;

public class HibernateCacheUtil {
	
	private static SessionFactory sessionFactory;

	private HibernateCacheUtil() {
		
	}
			
	public static SessionFactory buiSessionFactory() {
		if(sessionFactory==null) {
			sessionFactory=new Configuration().configure("Hibernate.cache.cfg.xml").addAnnotatedClass(EmployeeInfoBean.class).buildSessionFactory();
		}
		return sessionFactory;
	}
	public static SessionFactory getseSessionFactory() {
		return sessionFactory;
	}
	
	public SessionFactory openSessionFactory() {
		return sessionFactory;
	}

}
