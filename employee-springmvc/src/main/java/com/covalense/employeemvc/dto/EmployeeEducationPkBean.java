package com.covalense.employeemvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeEducationPkBean implements Serializable {
	@ManyToOne
	@JoinColumn(name="ID")
	
	private EmployeeInfoBean employeeInfoBean;
	
	@Column(name="EDUCATION_TYPE")
	private String EducationType;

}
