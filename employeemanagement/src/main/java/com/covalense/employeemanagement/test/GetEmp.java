package com.covalense.employeemanagement.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.employeemanagement.bean.EmployeeInfo;
import com.covalense.employeemanagement.config.EmployeeManagementConfig;

import lombok.extern.java.Log;

@Log
public class GetEmp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeManagementConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);
		

		Session session = factory.openSession();
		
		EmployeeInfo bean = new EmployeeInfo();
		
		log.info(""+bean.getID());
		log.info(""+bean.getNAME());
		log.info(""+bean.getGENDER());
		log.info(""+bean.getAGE());
		log.info(""+bean.getSALARY());
		log.info(""+bean.getPHONE());
		//log.info(""+bean.setJOINING_DATE(date););
		log.info(""+bean.getACCOUNT_NUMBER());
		log.info(""+bean.getEMAIL());
		log.info(""+bean.getDESIGNATION());
		log.info(""+bean.getDOB());
		log.info(""+bean.getDEPT_ID());
		log.info(""+bean.getMNGR_ID());
		
		session.close();
	}

}
