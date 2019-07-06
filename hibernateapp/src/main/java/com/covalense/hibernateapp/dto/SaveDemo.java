package com.covalense.hibernateapp.dto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveDemo {
	public static void main(String[] args) throws ParseException {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		/*
		 * cfg.addAnnotatedClass(EmployeeInfo.class);
		 */

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		SimpleDateFormat smple = new SimpleDateFormat("yyyy-MM-dd");
		EmployeeInfo empInf = new EmployeeInfo();

		empInf.setID(33);
		empInf.setNAME("teena");
		empInf.setACCOUNT_NUMBER(123145666);
		empInf.setAGE(19);
		empInf.setDEPT_ID(2);
		empInf.setDESIGNATION("networking");
		Date date = smple.parse("2000-07-16");
		empInf.setDOB(date);
		empInf.setEMAIL("tinu@gmail.com");
		empInf.setGENDER("female");
		Date date1 = smple.parse("2019-03-13");
		empInf.setJOINING_DATE(date1);
		empInf.setMNGR_ID(74);
		empInf.setPHONE(1432689456);
		empInf.setSALARY(13000);

		Transaction transaction = session.beginTransaction();
		// session.save(empInf);
		session.saveOrUpdate(empInf);
		transaction.commit();
		session.close();

	}

}
