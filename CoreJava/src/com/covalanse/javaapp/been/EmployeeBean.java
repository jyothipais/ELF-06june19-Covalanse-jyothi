package com.covalanse.javaapp.been;

import java.util.Date;

public class EmployeeBean {

	private int id, age;
	private String name, departement, gender;
	private double salary;
	private Date joining_Date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeBean() {

	}

	public EmployeeBean(int id, int age, String name, String departement, String gender, double salary,
			Date joining_Date) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.departement = departement;
		this.gender = gender;
		this.salary = salary;
		this.joining_Date = joining_Date;
	}

	public Date getJoining_Date() {
		return joining_Date;
	}

	public void setJoining_Date(Date joining_Date) {
		this.joining_Date = joining_Date;
	}

	public String toString() {
		return "EmployeeBean [id=" + id + ", age=" + age + ", name=" + name + ", departement=" + departement
				+ ", gender=" + gender + ", salary=" + salary + ", joining_Date=" + joining_Date + "]";
	}

}
