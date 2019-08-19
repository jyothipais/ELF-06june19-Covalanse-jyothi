package com.covalense.employeemvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Embeddable
public class EmployeeExperiencePkBean implements Serializable {
	@ManyToOne
	@JoinColumn(name="ID")
	private EmployeeInfoBean employeeInfoBean;
	
	@Column(name="COMPANY_NAME")
	private String companyName;	

}
