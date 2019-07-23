 package com.covalense.emp.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name = "employee_info")
@Data 
public class EmployeeInfo implements Serializable{

	@OneToOne (cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private EmployeeOtherInfo otherInfo;
	
	@Id
	@Column(name = "ID")
	private int ID;

	@Column(name = "NAME")
	private String NAME;

	@Column(name = "AGE")
	private int AGE;

	@Column(name = "GENDER")
	private String GENDER;

	@Column(name = "SALARY")
	private double SALARY;

	@Column(name = "PHONE")
	private int PHONE;

	@Column(name = "JOINING_DATE")
	private Date JOINING_DATE;

	@Column(name = "ACCOUNT_NUMBER")
	private int ACCOUNT_NUMBER;

	@Column(name = "EMAIL")
	private String EMAIL;

	@Column(name = "DESIGNATION")
	private String DESIGNATION;

	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "DEPT_ID")
	private int DEPT_ID;

	@Column(name = "MNGR_ID")
	private int MNGR_ID;
	
	@Column(name = "PASSWORD")
	private String PASSWORD;
	


}
