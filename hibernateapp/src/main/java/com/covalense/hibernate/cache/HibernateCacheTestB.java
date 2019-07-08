package com.covalense.hibernate.cache;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfo;

import lombok.extern.java.Log;
@Log
public class HibernateCacheTestB {
	public static void main(String[] args) {
		//1.Load the config File.
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);
		//2.Build the session.
		SessionFactory factory = cfg.buildSessionFactory();
		//3.Open the session.
		Session session = factory.openSession();
		//4.Interact with DB.
		EmployeeInfo bean=session.get(EmployeeInfo.class,3);
		log.info("First Time"+bean.toString());
		EmployeeInfo bean1=session.get(EmployeeInfo.class,3);
		log.info("Second Time"+bean1.toString());
		EmployeeInfo bean2=session.get(EmployeeInfo.class,3);
		log.info("3rdTime"+bean2.toString());
		EmployeeInfo bean3=session.get(EmployeeInfo.class,3);
		log.info("4th Time"+bean3.toString());
		//5.Close the Session.
		session.close();
	}

}
