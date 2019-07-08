package com.covalense.hibernate.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.covalense.hibernateapp.dto.EmployeeInfo;
import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class GetAllDetailsUsingRestrictions {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(EmployeeInfo.class);

		
		  Criterion cr = Restrictions.eq("id", 3); Restrictions.sizeGt("SALARY",
		  12000); criteria.add(cr);
		 

		
		  EmployeeInfo emp= (EmployeeInfo) criteria.uniqueResult(); log.info(""+emp);
		  log.info(""+emp);
		 
		
	}

}
