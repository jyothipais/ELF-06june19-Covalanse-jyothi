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
		EmployeeInfo bean ;	
		try (SessionFactory session=HibernateCacheUtil.getSessionFactory()){
			
			bean=session.get(EmployeeInfo.class, id);	
		} 
			return bean;
	}

}
