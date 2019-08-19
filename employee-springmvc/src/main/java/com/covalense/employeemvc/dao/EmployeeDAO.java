package com.covalense.employeemvc.dao;

import com.covalense.employeemvc.dto.EmployeeInfoBean;


public interface EmployeeDAO {

EmployeeInfoBean getEmployeeInfoBean(String id);

EmployeeInfoBean getEmployeeInfoBean(int id);

boolean createEmployeeInfoBean(EmployeeInfoBean bean);

boolean updateEmployeeInfoBean(EmployeeInfoBean bean);

boolean deleteEmployeeInfoBean(int id);

boolean deleteEmployeeInfoBean(String id);
}
