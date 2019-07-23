package com.covalense.employeemanagement.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeemanagement.bean.EmployeeInfo;
import com.covalense.employeemanagement.config.EmployeeManagementConfig;

public class UpdateEmp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeManagementConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);

		Session session = factory.openSession();

		EmployeeInfo bean = session.get(EmployeeInfo.class, 3);
		bean.setDESIGNATION("Java Developer");

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
