package com.covalense.webapp.dao;

public class EmployeeDAOFactory {

	private EmployeeDAOFactory() {

	}

	private static String dbInteractionType = "hibernate";

	public static EmployeeDAO getinstance() {
		EmployeeDAO dao = null;
		if (dbInteractionType.equals("jdbc")) {
			dao = new EmployeeDAOHibernateimpl();
		} else if (dbInteractionType.equals("hibernate")) {
			dao = new EmployeeDAOHibernateimpl();
		}
		return dao;
	}

}
