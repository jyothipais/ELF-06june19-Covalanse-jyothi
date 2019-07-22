package com.covalense.hibernateapp.curdoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.hibernateapp.bean.CustomerBean;
import com.covalense.hibernateapp.bean.Student_Other_info;
import com.covalense.hibernateapp.bean.Student_info;
import com.covalense.hibernateapp.util.HibernateUtil;

public class HibernateOneToOneTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory=HibernateUtil.buiSessionFactory();
		Session session=sessionFactory.openSession();		
		Configuration configuration=new Configuration();
		configuration.addAnnotatedClass(CustomerBean.class);
		
		Student_info info=new Student_info();
		info.setRollno(31);
		 info.setName("jyothi");
		 info.setGender("Female");
		info.setMobileno(1234257l);
		info.setEnailid("jyothi@gmail.com");
		
		Student_Other_info other_info=new Student_Other_info();
		other_info.setRollno(31);
		other_info.setFatherName("Luvis Pais");
		other_info.setMotherName("Lavina Pais");
		other_info.setNationality("Indian");
		other_info.setRiligion("christian");
		
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(info);
		session.saveOrUpdate(other_info);
		transaction.commit();
		session.close();
	}

}
