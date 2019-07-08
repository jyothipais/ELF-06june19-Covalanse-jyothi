package com.covalense.designpattern.builder;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
@Builder
@ToString
public final class EmployeeData3 {
	private int ID;
	private String NAME;
	private int AGE;
	private String GENDER;
	private double SALARY;
	private int PHONE;
	private Date JOINING_DATE;
	private int ACCOUNT_NUMBER;
	private String EMAIL;
	private String DESIGNATION;
	private Date DOB;
	private int DEPT_ID;
	private int MNGR_ID;
	

}
