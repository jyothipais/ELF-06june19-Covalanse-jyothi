package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;

public class HibernateUtil {	
		private static SessionFactory sessionFactory;

		private HibernateUtil() {
			
		}
				
		public static SessionFactory buiSessionFactory() {
			if(sessionFactory==null) {
				sessionFactory=new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(CustomerBean.class).buildSessionFactory();
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
