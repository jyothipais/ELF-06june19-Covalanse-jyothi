package com.covalense.mapping.bean.manytoone;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
@SuppressWarnings("serial")
@Entity
@Table(name="employee_experience_info")
@Data
public class EmployeeExperienceInfo implements Serializable {

	@EmbeddedId
	private EmployeeExperiencePkBean experiencePkBean;
	
	@Column(name="DESIGNATION")
	private String designation;
	@Column(name="JOINING_DATE")
	private Date joiningDate;
	@Column(name="LEAVING_DATE")
	private Date leavingDate;
}
