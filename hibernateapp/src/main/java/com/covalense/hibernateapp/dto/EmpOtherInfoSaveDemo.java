package com.covalense.hibernateapp.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpOtherInfoSaveDemo {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		EmployeeOtherInfo empotherInfo = new EmployeeOtherInfo();
		
		empotherInfo.setID(3);
		empotherInfo.set_challenged(false);
		empotherInfo.setBLOOD_GROUP("B +ve");
		empotherInfo.setEMERGENCY_CONTACT_NUMBER(11223341);
		empotherInfo.setADHAR(213143516);
		empotherInfo.setEMERGENCY_CONTACT_PERSON("mother");
		empotherInfo.setFATHER_NAME("Luvis Pais");
		empotherInfo.setIS_MARRIED(false);
		empotherInfo.setMOTHER_NAME("Lavina Pais");
		empotherInfo.setNATIONALITY("indian");
		empotherInfo.setPAN(123);
		empotherInfo.setRELIGION("Christian");
		empotherInfo.setSPOUSE_NAME("XYZ");
		
		Transaction transaction = session.beginTransaction();
		session.save(empotherInfo );
		transaction.commit();
		session.close();

	}

}
