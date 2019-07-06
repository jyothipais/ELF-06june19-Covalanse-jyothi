package com.covalense.hibernateapp.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class EmployeeExperienceInfo {
	private int ID;
	private String COMPANY_NAME;
	private String DESIGNATION;
	private Date JOINING_DATE;
	private Date LEAVING_DATE;

}
