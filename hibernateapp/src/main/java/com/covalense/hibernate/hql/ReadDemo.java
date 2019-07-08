package com.covalense.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.covalense.hibernateapp.dto.EmployeeInfo;
import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class ReadDemo {
	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		//String hql = " from EmployeeInfo";
		String hql = " select NAME from EmployeeInfo";
		Query query = session.createQuery(hql);
		List<String> ename=query.list();
		for(String  empname:ename) {
			log.info(""+empname);
		}
		
		/*
		 * for (EmployeeInfo employeeInfo2 : employeeInfo) {
		 * log.info("ID="+employeeInfo2.getID());
		 * log.info("NAME="+employeeInfo2.getAGE());
		 * log.info(""+employeeInfo2.getNAME()); log.info(""+employeeInfo2.getAGE());
		 * log.info(""+employeeInfo2.getEMAIL());
		 * log.info(""+employeeInfo2.getGENDER());
		 * log.info(""+employeeInfo2.getDEPT_ID());
		 * log.info(""+employeeInfo2.getACCOUNT_NUMBER());
		 * log.info(""+employeeInfo2.getDESIGNATION());
		 * log.info(""+employeeInfo2.getMNGR_ID()); }
		 */
		
	}
}
