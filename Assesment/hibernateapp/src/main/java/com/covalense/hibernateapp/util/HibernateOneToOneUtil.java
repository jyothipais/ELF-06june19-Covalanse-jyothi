package com.covalense.hibernateapp.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.bean.Student_Other_info;
import com.covalense.hibernateapp.bean.Student_info;

public class HibernateOneToOneUtil {	
		private static SessionFactory sessionFactory;

		private HibernateOneToOneUtil() {
			
		}
				
		public static SessionFactory buiSessionFactory() {
			if(sessionFactory==null) {
				sessionFactory=new Configuration().configure("Hibernate.cfg.xml").addAnnotatedClass(Student_info.class).addAnnotatedClass(Student_Other_info.class).buildSessionFactory();
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
