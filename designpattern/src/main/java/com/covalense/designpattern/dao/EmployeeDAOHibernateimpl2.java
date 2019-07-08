package com.covalense.designpattern.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.covalense.designpattern.beans.EmployeeInfo;
import com.covalense.designpattern.util.HibernateUtil;

public class EmployeeDAOHibernateimpl2 implements EmployeeDAO {

	@Override
	public EmployeeInfo getEmployeeInfo(String id) {

		return getEmployeeInfo(Integer.parseInt(id));
	}

	@Override
	public EmployeeInfo getEmployeeInfo(int id) {

		Session session = HibernateUtil.openSession();
		EmployeeInfo bean = session.get(EmployeeInfo.class, id);
		session.close();

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
