package com.covalense.wherehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.wherehouse.bean.ItemBean;
import com.covalense.wherehouse.config.HibernateConfig;

public class UpdateItem {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);

		Session session = factory.openSession();
		
		ItemBean bean=session.get(ItemBean.class,21);
		bean.setDescription("########");
		
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.saveOrUpdate(bean);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			session.close();
		}
	}

}
