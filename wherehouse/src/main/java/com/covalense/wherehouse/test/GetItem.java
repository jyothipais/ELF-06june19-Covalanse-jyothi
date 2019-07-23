package com.covalense.wherehouse.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.covalense.wherehouse.bean.ItemBean;
import com.covalense.wherehouse.config.HibernateConfig;

import lombok.extern.java.Log;
@Log
public class GetItem {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
		SessionFactory factory = context.getBean(SessionFactory.class);

		Session session = factory.openSession();
		
		ItemBean bean=session.get(ItemBean.class,21);
		log.info(""+bean.getItem_Id());
		log.info(""+bean.getName());
		log.info(""+bean.getDescription());
		log.info(""+bean.getCost());
		log.info(""+bean.getQuantity());
		
		session.close();
	}

}
