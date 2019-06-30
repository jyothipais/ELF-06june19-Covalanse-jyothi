package com.covalense.javaapp.constructor;

import java.util.logging.Logger;

public class Employee {
	final static Logger loger = Logger.getLogger("Employee");
	String emp_name;
	int emp_no, salary;

	Employee(String emp_name, int emp_no, int salary) {
		this.emp_name = emp_name;
		this.emp_no = emp_no;
		this.salary = salary;
	}

	void display() {
		loger.info("EMP_NAME is" + emp_name);
		loger.info("EMP_NO is" + emp_no);
		loger.info("SALARY is" + salary);
	}
}
