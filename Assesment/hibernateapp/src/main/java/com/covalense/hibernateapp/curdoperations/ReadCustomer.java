package com.covalense.hibernateapp.curdoperations;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.util.HibernateUtil;

import lombok.extern.java.Log;
@Log
public class ReadCustomer {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.buiSessionFactory();
		Configuration configuration=new Configuration();
		
		CustomerBean bean=new CustomerBean();
		bean.getId();
		bean.getFirstname();
		bean.getLastname();
		bean.getAddress();
		bean.getCity();
		bean.getCountry();
	}
	
	

}
