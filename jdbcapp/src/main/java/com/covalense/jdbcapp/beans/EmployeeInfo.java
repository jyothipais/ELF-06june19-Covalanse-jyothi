package com.covalense.jdbcapp.beans;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeInfo {
	private int ID;    
	private String NAME;
	private int AGE	;    
	private String GENDER; 
	private double SALARY; 
	private int PHONE	;    
	private Date JOINING_DATE; 
	private int ACCOUNT_NUMBER	;   
	private String EMAIL; 
	private String DESIGNATION;
	private Date DOB;  
	private int DEPT_ID;  
	private int MNGR_ID;    


}
