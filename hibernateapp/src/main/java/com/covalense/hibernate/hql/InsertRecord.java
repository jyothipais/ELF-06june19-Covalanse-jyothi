package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class InsertRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		String hql = " insert into DupEmpInfo (ID,NAME,EMAIL,AGE,GENDER,PHONE) select ID,NAME,EMAIL,AGE,GENDER,PHONE from EmployeeInfo where id =3";
		Query query = session.createQuery(hql);
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("Inserted" + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}
	

}
