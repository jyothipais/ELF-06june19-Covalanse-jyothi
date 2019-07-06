package com.covalense.designpattern.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {

	}

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getinstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOHibernateimpl2();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateimpl2();
		}
		return dao;
	}

}
