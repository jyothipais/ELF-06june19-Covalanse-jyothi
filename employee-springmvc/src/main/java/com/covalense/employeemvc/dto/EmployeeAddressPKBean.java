package com.covalense.employeemvc.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@SuppressWarnings("serial")
@Data
@Embeddable
public class EmployeeAddressPKBean implements Serializable{
	@ManyToOne
	@JoinColumn(name="ID")
	
	private EmployeeInfoBean employeeInfoBean;   
	
	@Column(name="ADDRESS_TYPE")
	private String addressType;	

}
