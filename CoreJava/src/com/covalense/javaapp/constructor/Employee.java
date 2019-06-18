package com.covalense.javaapp.constructor;

public class Employee {
	String emp_name;
	int emp_no, salary;

	Employee(String emp_name, int emp_no, int salary) {
		this.emp_name = emp_name;
		this.emp_no = emp_no;
		this.salary = salary;
	}

	void display() {
		System.out.println("EMP_NAME is" + emp_name);
		System.out.println("EMP_NO is" + emp_no);
		System.out.println("SALARY is" + salary);
	}
}
