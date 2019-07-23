package com.covalense.emp.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employee_other_info")
@Data
public class EmployeeOtherInfo implements Serializable {
	
	@Id
	@Column(name = "ID")
	private int ID;

	@Column(name = "NATIONALITY")
	private String NATIONALITY;

	@Column(name = "RELIGION")
	private String RELIGION;

	@Column(name = "IS_MARRIED")
	private boolean IS_MARRIED;

	@Column(name = "BLOOD_GROUP")
	private String BLOOD_GROUP;

	@Column(name = "IS_challenged")
	private boolean is_challenged;

	@Column(name = "EMERGENCY_CONTACT_NUMBER")
	private int EMERGENCY_CONTACT_NUMBER;

	@Column(name = "EMERGENCY_CONTACT_PERSON")
	private String EMERGENCY_CONTACT_PERSON;

	@Column(name = "PAN")
	private int PAN;

	@Column(name = "FATHER_NAME")
	private String FATHER_NAME;

	@Column(name = "MOTHER_NAME")
	private String MOTHER_NAME;

	@Column(name = "SPOUSE_NAME")
	private String SPOUSE_NAME;

	@Column(name = "PASSPORT")
	private String PASSPORT;

	@Column(name = "ADHAR")
	private int ADHAR;

}
