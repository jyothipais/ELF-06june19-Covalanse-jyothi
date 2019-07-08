package com.covalense.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.hubernate.util.HibernateUtil;

import lombok.extern.java.Log;

@Log
public class UpdateRecord {
	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.buildSessionFactory();
		Session session = factory.openSession();
		//String hql = " update from EmployeeInfo set NAME='sithara' where id=33";
		//String hql = " update from EmployeeInfo set AGE=:eage where NAME=:ename";
		String hql = " update from EmployeeInfo set AGE="+args[0]+" where NAME='"+args[1]+"'";
		Query query = session.createQuery(hql);
		/*
		 * query.setParameter("eage",Integer.parseInt("args[0]"));
		 * query.setParameter("ename",args[1]);
		 */
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			int result = query.executeUpdate();
			log.info("updated" + result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
