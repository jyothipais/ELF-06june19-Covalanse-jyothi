package com.covalense.hibernateapp.curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class DeleteCustomer {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.buiSessionFactory();
		Session session=sessionFactory.openSession();		
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(CustomerBean.class);
		
		CustomerBean bean=(CustomerBean) session.get("id",3);
		
		
		Transaction transaction = session.beginTransaction();
		
		transaction.commit();
		session.delete(bean);
		transaction.rollback();
		session.close();
		
	}

}
