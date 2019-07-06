package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hubernate.util.HibernateUtil;


public class DeleteRecord {
	public static void main(String[] args) {
		/*
		 * Configuration cfg = new Configuration(); cfg.configure("hibernate.cfg.xml");
		 */
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		
		
		EmployeeOtherInfo empInfother = session.get(EmployeeOtherInfo.class, 6);
		empInfother.getID();
		Transaction transaction = session.beginTransaction();
		session.delete(empInfother);
		transaction.commit();
		
		session.close();
	}

}
