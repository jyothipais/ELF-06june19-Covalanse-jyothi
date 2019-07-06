package com.covalense.jdbcapp.beans.copy;

import lombok.Data;

@Data
public class EmployeeEducationInfo {
	private int ID;
	private String EDUCATION_TYPE;
	private String DEGREE_TYPE;
	private String BRANCH;
	private String COLLAGE_NAME;
	private String UNIVERSITY;
	private Data YOP;
	private double PERCENTAGE;
	private String LOCATION;

}
