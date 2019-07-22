package com.covalense.hibernateapp.curdoperations;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.sql.Select;

import com.covalense.hibernateapp.bean.ProductBean;
import com.covalense.hibernateapp.util.HibernateUtil;

public class Ristrictions {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.buiSessionFactory();
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(ProductBean.class);
		
		Criterion criterion=(Criterion) criteria.add(.class);
				
		Transaction transaction=session.beginTransaction();
		session.close();
	}

}
