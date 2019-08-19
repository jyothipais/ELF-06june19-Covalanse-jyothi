package com.covalense.employeemvc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDAOFactory {
	private EmployeeDAOFactory() {
	}
		@Bean("jdbc")
		public EmployeeDAO getInstance() {
			return new EmployeeDAOJDBCImpl();
		}
		@Bean("hibernate")
		public EmployeeDAO getInstanceHibernate() {
			return new EmployeeDAOHibernateImpl();
		}
	
}
