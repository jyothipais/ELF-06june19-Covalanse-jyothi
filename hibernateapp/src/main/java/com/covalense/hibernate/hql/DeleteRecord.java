package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class DeleteRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		String hql = "delete  from EmployeeInfo  where id=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid",7);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("deleted" + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
