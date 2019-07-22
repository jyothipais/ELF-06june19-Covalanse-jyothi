package com.covalense.hibernateapp.curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class SaveCustomer {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.buiSessionFactory();
		Session session=sessionFactory.openSession();		
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(CustomerBean.class);
		
		CustomerBean bean=new CustomerBean();
		
		bean.setAddress("Manglore");
		bean.setCity("Mangalore");
		bean.setContactnumber(12345l);
		bean.setCountry("India");
		bean.setFirstname("jyothi");
		bean.setLastname("pais");
		bean.setId(31);
		bean.setState("Karnataka");
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(bean);
		transaction.commit();
		session.close();
		
	}

}
