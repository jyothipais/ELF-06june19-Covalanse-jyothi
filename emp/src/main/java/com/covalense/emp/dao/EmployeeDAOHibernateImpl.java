package com.covalense.emp.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.covalense.emp.bean.EmployeeInfo;
import com.covalense.emp.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	public ArrayList<EmployeeInfo> getAllEmployeeInfo() {
		
		return null;
	}

	public EmployeeInfo getEmployeeInfo(String id) {
		return getEmployeeInfo(Integer.parseInt(id));
	}

	public EmployeeInfo getEmployeeInfo(int id) {
		EmployeeInfo bean=null;
		try (Session session = HibernateUtil.openSession();){			
			 bean = session.get(EmployeeInfo.class, id);
		} 
			return bean;
	}

	public boolean createEmployeeInfo(EmployeeInfo bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfo(EmployeeInfo bean) {
		return saveOrUpdate(bean);
	}

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

	public boolean deleteEmployeeInfo(String id) {
		return deleteEmployeeInfo(Integer.parseInt(id));
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
	}

	

