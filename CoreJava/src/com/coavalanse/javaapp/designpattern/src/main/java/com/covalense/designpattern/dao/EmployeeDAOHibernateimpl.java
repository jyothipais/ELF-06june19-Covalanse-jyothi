package com.covalense.designpattern.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.covalense.designpattern.beans.EmployeeInfo;

public class EmployeeDAOHibernateimpl implements EmployeeDAO {

	@Override
	public ArrayList<EmployeeInfo> getAllEmployeeInfo() {

		return null;
	}

	@Override
	public EmployeeInfo getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfo getEmployeeInfo(int id) {
		//1.Load the config file.
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//cfg.configure("MyHibernteConfigFile.xml");
		//cfg.configure(new String(" https://raw.githubusercontent.com/jyothipais/ELF-06june19-Covalanse-jyothi/master/MyHibernteConfigFile.xml"));
		cfg.addAnnotatedClass(EmployeeInfo.class);
		
		//2.Build the session factory.		
		SessionFactory factory = cfg.buildSessionFactory();
		
		//3.Open Session.
		Session session = factory.openSession();
		
		//4.Interact with DB via Session
		EmployeeInfo bean = new EmployeeInfo();
		session.close();
		
		//5.Close Session.
		return bean;
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
