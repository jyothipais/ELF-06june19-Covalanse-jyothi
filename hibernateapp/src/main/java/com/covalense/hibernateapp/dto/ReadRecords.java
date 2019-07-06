package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import lombok.extern.java.Log;

@Log
public class ReadRecords {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		EmployeeOtherInfo empInfother = session.get(EmployeeOtherInfo.class, 3);
		log.info("ID IS : " + empInfother.getID());
		log.info("FATHER NAME IS : " + empInfother.getFATHER_NAME());
		log.info("OTHER NAME IS : " + empInfother.getMOTHER_NAME());

		session.close();

	}

}
