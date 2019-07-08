package com.covalense.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class HibernateCacheTest {
	public static void main(String[] args) {
		log.info("1st Time----->" + getEmployeeData(3).toString());
		log.info("2nd Time---->" + getEmployeeData(3).toString());
		log.info("3rd Time---->" + getEmployeeData(3).toString());
	}

	private static EmployeeInfo getEmployeeData(int id) {
		// 1.Load the config File.
		Configuration cfg = new Configuration();
		cfg.configure("com/covalense/hibernate/cache/hibernate.cache.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);
		// 2.Build the session.
		SessionFactory factory = cfg.buildSessionFactory();
		// 3.Open the session.
		Session session = factory.openSession();
		// 4.Interact with DB.
		EmployeeInfo bean = session.get(EmployeeInfo.class, id);
		log.info("First Time" + bean.toString());
		// 5.Close the Session.
		session.close();
		return bean;
	}

}
