package com.covalense.mapping.model;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.covalense.mapping.bean.manytomany.TrainingInfo;
import com.covalense.mapping.bean.manytoone.EmployeeAddressInfoBean;
import com.covalense.mapping.bean.manytoone.EmployeeEducationInfo;
import com.covalense.mapping.bean.manytoone.EmployeeExperienceInfo;
import com.covalense.mapping.bean.onetoone.EmployeeOtherInfoBean;
import com.covalense.mapping.primarybean.EmployeeInfoBean;



public class HibernateImpl {
	private Configuration configuration = new Configuration();
	private SessionFactory sessionFactory = configuration.configure().buildSessionFactory();

	public void craeteEmployee(EmployeeInfoBean empinfo1,
			EmployeeOtherInfoBean employeeOtherInfo,
			List<EmployeeAddressInfoBean> employeeAddressInfo,
			List<EmployeeEducationInfo> employeeEducationInfo,
			List<EmployeeExperienceInfo> employeeExpInfo) {	
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(empinfo1);
		 session.save(employeeOtherInfo); 
			
	for(EmployeeAddressInfoBean empAddreInfo:employeeAddressInfo) {
		session.save(empAddreInfo);
	}
	for(EmployeeEducationInfo educationInfo:employeeEducationInfo) {
		session.save(educationInfo);
	}
	for(EmployeeExperienceInfo experienceInfo:employeeExpInfo) {
		session.save(experienceInfo);
	}
	transaction.commit();
	session.close();
	
	}
		public EmployeeInfoBean getEmployeeInfoBean(int id) {
			Session session = sessionFactory.openSession();
			EmployeeInfoBean bean=session.get(EmployeeInfoBean.class, id);
			session.close();
			return bean;
		}
		public void createTraining(TrainingInfo trainingInfo) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(trainingInfo);
			transaction.commit();
			session.close();
	}
		public void createEmployee(EmployeeInfoBean bean ) {
			Session session=sessionFactory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(bean);
			transaction.commit();
			session.close();
		}

}
