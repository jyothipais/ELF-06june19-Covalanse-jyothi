package com.covalense.mapping.bean.manytoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
@Table(name = "employee_education_info")
public class EmployeeEducationInfo implements Serializable {
	@EmbeddedId
	private EmployeeEducationPkBean educationPkBean;

	@Column(name = "BRANCH")
	private String barnch;
	@Column(name = "COLLAGE_NAME")
	private String collageName;
	@Column(name = "UNIVERSITY")
	private String university;
	@Column(name = "YOP")
	private Date yop;
	@Column(name = "PERCENTAGE")
	private double percentage;
	@Column(name = "LOCATION")
	private String location;

}
