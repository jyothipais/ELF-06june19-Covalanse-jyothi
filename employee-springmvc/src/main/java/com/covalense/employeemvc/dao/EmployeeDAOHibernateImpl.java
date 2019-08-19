package com.covalense.employeemvc.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.covalense.employeemvc.dto.EmployeeInfoBean;
import com.covalense.employeemvc.util.HibernateUtil;

public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	@Autowired
	private HibernateUtil hibernateUtil;

	public List<EmployeeInfoBean> getAllEmployeeInfoBean(int id) {
		List<EmployeeInfoBean> bean = null;
		try (Session session = hibernateUtil.openSession();) {
			String hql = "from EmployeeInfoBean";
			bean = session.createQuery(hql).list();
		}
		return bean;
	}
	@Override
	public EmployeeInfoBean getEmployeeInfoBean(String id) {
		return getEmployeeInfoBean(Integer.parseInt(id));
	}

	public EmployeeInfoBean getEmployeeInfoBean(int id) {
		EmployeeInfoBean bean = null;
		try (Session session = hibernateUtil.openSession();) {
			bean = session.get(EmployeeInfoBean.class, id);
		}
		return bean;
	}

	public boolean createEmployeeInfoBean(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}

	public boolean updateEmployeeInfoBean(EmployeeInfoBean bean) {
		return saveOrUpdate(bean);
	}
		public boolean deleteEmployeeInfoBean(int id) {
		Transaction txn = null;
		EmployeeInfoBean bean = new EmployeeInfoBean();
		bean.setId(id);
		try {
			Session session = hibernateUtil.openSession();
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

	public boolean deleteEmployeeInfoBean(String id) {
		return deleteEmployeeInfoBean(Integer.parseInt(id));
	}

	private boolean saveOrUpdate(EmployeeInfoBean bean) {
		Transaction txn = null;
		try {
			Session session = hibernateUtil.openSession();
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
