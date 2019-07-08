package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hibernateapp.dto.EmployeeInfo;
import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetails {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfo.class);
		List<EmployeeInfo> emp = criteria.list();
		
		for (EmployeeInfo employeeInfo2 : emp) {
			log.info("ID=" + employeeInfo2.getID());
			log.info("NAME=" + employeeInfo2.getAGE());
			log.info("" + employeeInfo2.getNAME());
			log.info("" + employeeInfo2.getAGE());
			log.info("" + employeeInfo2.getEMAIL());
			log.info("" + employeeInfo2.getGENDER());
			log.info("" + employeeInfo2.getDEPT_ID());
			log.info("" + employeeInfo2.getACCOUNT_NUMBER());
			log.info("" + employeeInfo2.getDESIGNATION());
			log.info("" + employeeInfo2.getMNGR_ID());
		}

	}

}
