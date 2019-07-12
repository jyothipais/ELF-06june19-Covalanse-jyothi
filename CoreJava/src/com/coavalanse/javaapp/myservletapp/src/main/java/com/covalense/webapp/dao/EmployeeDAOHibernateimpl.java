package com.covalense.webapp.dao;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.covalense.webapp.bean.EmployeeInfo;
import com.covalense.webapp.util.HibernateUtil;

public class EmployeeDAOHibernateimpl implements EmployeeDAO {

	@Override
	public EmployeeInfo getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfo getEmployeeInfo(int id) {
		EmployeeInfo bean=null;
		try (Session session = HibernateUtil.openSession();){			
			 bean = session.get(EmployeeInfo.class, id);
		} 
			return bean;
	}

	private boolean saveOrUpdate(EmployeeInfo bean) {
		Transaction txn = null;
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.saveOrUpdate(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean createEmployeeInfo(EmployeeInfo bean) {

		return saveOrUpdate(bean);
	}

	@Override
	public ArrayList<EmployeeInfo> getAllEmployeeInfo() {

		return null;
	}

	@Override
	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		// TODO Auto-generated method stub
		return saveOrUpdate(bean);
	}

	@Override
	public boolean deleteEmployeeInfo(int id) {
		Transaction txn = null;
		EmployeeInfo bean = new EmployeeInfo();
		bean.setID(id);
		try {
			Session session = HibernateUtil.openSession();
			txn = session.beginTransaction();
			session.delete(bean);
			txn.commit();
			return true;
		} catch (Exception e) {
			txn.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteEmployeeInfo(String id) {
		// TODO Auto-generated method stub
		return deleteEmployeeInfo(Integer.parseInt(id));
	}

}
