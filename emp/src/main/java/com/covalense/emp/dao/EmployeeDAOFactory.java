package com.covalense.emp.dao;

import java.util.List;

import com.covalense.emp.bean.EmployeeInfo;

public class EmployeeDAOFactory implements EmployeeDAO{
	private EmployeeDAOFactory() {

	}
	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getinstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOHibernateImpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateImpl();
		}
		return dao;
	}

	public List<EmployeeInfo> getAllEmployeeInfo() {
				return null;
	}

	public EmployeeInfo getEmployeeInfo(String id) {
			return null;
	}

	public EmployeeInfo getEmployeeInfo(int id) {
				return null;
	}

	public boolean createEmployeeInfo(EmployeeInfo bean) {
				return false;
	}

	public boolean updateEmployeeInfo(EmployeeInfo bean) {
				return false;
	}

	public boolean deleteEmployeeInfo(int id) {
				return false;
	}

	public boolean deleteEmployeeInfo(String id) {
			return false;
	}


}
