package com.covalense.mapping.bean.manytoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.covalense.mapping.primarybean.EmployeeInfoBean;

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
