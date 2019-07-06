package com.covalense.designpattern.dao;

import java.util.ArrayList;

import com.covalense.designpattern.beans.EmployeeInfo;

public interface EmployeeDAO {
	ArrayList<EmployeeInfo> getAllEmployeeInfo();

	EmployeeInfo getEmployeeInfo(String id);

	EmployeeInfo getEmployeeInfo(int id);

	boolean createEmployeeInfo(EmployeeInfo bean);

	boolean updateEmployeeInfo(EmployeeInfo bean);

	boolean deleteEmployeeInfo(int id);

	boolean deleteEmployeeInfo(String id);
}// End of Interface
