package com.covalense.mapping.bean.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.covalense.mapping.primarybean.EmployeeInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_other_info")
@Data
public class EmployeeOtherInfoBean implements Serializable{

	/* @Id */
	@OneToOne
	@PrimaryKeyJoinColumn(name="ID")
	private EmployeeInfoBean employeeInfo; 

	@Column(name = "NATIONALITY")
	private String nationality;

	@Column(name = "RELIGION")
	private String religion;

	@Column(name = "IS_MARRIED")
	private boolean isMarried;

	@Column(name = "BLOOD_GROUP")
	private String bloodGroup;

	@Column(name = "IS_challenged")
	private boolean isChallanged;

	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	private int emergencyContactNumber;

	@Column(name = "EMERGENCY_CONTACT_PERSON")
	private String emegrencyContactPerson;

	@Column(name = "PAN")
	private int pan;

	@Column(name = "FATHER_NAME")
	private String fatherName;

	@Column(name = "MOTHER_NAME")
	private String motherName;

	@Column(name = "SPOUSE_NAME")
	private String spouseName;

	@Column(name = "PASSPORT")
	private String passport;

	@Column(name = "ADHAR")
	private int adhar;
}
