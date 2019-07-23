package com.covalense.emp.dao;

import java.util.List;

import com.covalense.emp.bean.EmployeeInfo;

public interface EmployeeDAO {

EmployeeInfo getEmployeeInfo(String id);
EmployeeInfo getEmployeeInfo(int id);

boolean createEmployeeInfo(EmployeeInfo bean);

boolean updateEmployeeInfo(EmployeeInfo bean);

boolean deleteEmployeeInfo(int id);

boolean deleteEmployeeInfo(String id);
}
