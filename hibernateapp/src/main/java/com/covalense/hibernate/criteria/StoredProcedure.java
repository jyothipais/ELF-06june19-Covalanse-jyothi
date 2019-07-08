package com.covalense.hibernate.criteria;

import java.util.List;

import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class StoredProcedure {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		StoredProcedureQuery query = session.createStoredProcedureCall("employee_info");
		List<Object[]> object = query.getResultList();

		for (Object[] object1 : object) {
			log.info("" + object1[0]);
			log.info("" + object1[1]);
			log.info("" + object1[2]);
		}
	}

}
