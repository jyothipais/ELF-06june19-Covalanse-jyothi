package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpOtherInfoUpdateDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfo empInfother = session.get(EmployeeOtherInfo.class, 3);
		empInfother.setSPOUSE_NAME("ABC");
		Transaction transaction = session.beginTransaction();
		session.update(empInfother);
		transaction.commit();
		session.close();

	}

}
