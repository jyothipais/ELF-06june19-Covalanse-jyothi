package com.covalense.hibernate.awsrds;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.dto.EmployeeInfo;

import lombok.extern.java.Log;

@Log
public class HibernateForAwsRds {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("/hibernateapp/src/main/java/com/covalense/hibernate/awsrds/hibernate.aws.cfg.xml");
		cfg.addAnnotatedClass(EmployeeInfo.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeInfo bean = session.get(EmployeeInfo.class, 3);
		log.info("Employee Details :" + bean.toString());
		session.close();
	}

}
