package com.covalense.webapp.dao;

import java.util.List;

import com.covalense.webapp.bean.EmployeeInfo;

public interface EmployeeDAO {
	List<EmployeeInfo> getAllEmployeeInfo();

	EmployeeInfo getEmployeeInfo(String id);

	EmployeeInfo getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfo bean);

	boolean updateEmployeeInfo(EmployeeInfo bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}// End of Interface
