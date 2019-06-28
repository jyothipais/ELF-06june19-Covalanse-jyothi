package com.covalense.javaapp.asessment;

import java.util.logging.Logger;

public class Employee {
	final Logger loger = Logger.getLogger("Employee");
	private int emp_id = 20;
	private String name = "sara";
	private double salary = 25.500;

	public Employee(int emp_id, String name, double salary) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {

	}

	void getDetails() {
		loger.info("ID is:" + emp_id);
		loger.info("NAME is:" + name);
		loger.info("SALARY is:" + salary);
	}

}
