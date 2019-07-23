package com.covalense.employeemanagement.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeemanagement.bean.EmployeeInfo;
import com.covalense.employeemanagement.config.EmployeeManagementConfig;


public class AddEmp {
	public static void main(String[] args) throws ParseException {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeManagementConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		SimpleDateFormat smple = new SimpleDateFormat("yyyy-MM-dd");
		Session session = factory.openSession();
		
		EmployeeInfo bean=new EmployeeInfo();
		
		bean.setID(501);
		bean.setNAME("Lavina");
		bean.setGENDER("Female");
		bean.setAGE(22);
		bean.setSALARY(45000);
		bean.setPHONE(5646373);
		Date date = smple.parse("2000-07-16");
		bean.setDOB(date);
		bean.setACCOUNT_NUMBER(764537);
		bean.setEMAIL("lavina@gmail.com");
		bean.setDESIGNATION("Testing");
		Date date1 = smple.parse("2019-03-13");
		bean.setJOINING_DATE(date1);
		bean.setDEPT_ID(2);
		bean.setMNGR_ID(75);		
		
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
