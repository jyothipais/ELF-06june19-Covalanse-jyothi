package com.covalense.hibernate.cache;

import java.io.Serializable

;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Entity
@Table(name = "employee_info")
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeInfo {
	@Id
	@Column(name = "ID")
	private int ID;

	@Column(name = "NAME")
	private String NAME;

	@Column(name = "AGE")
	private int AGE;

	@Column(name = "GENDER")
	private String GENDER;

	@Column(name = "SALARY")
	private double SALARY;

	@Column(name = "PHONE")
	private int PHONE;

	@Column(name = "JOINING_DATE")
	private Date JOINING_DATE;

	@Column(name = "ACCOUNT_NUMBER")
	private int ACCOUNT_NUMBER;

	@Column(name = "EMAIL")
	private String EMAIL;

	@Column(name = "DESIGNATION")
	private String DESIGNATION;

	@Column(name = "DOB")
	private Date DOB;

	@Column(name = "DEPT_ID")
	private int DEPT_ID;

	@Column(name = "MNGR_ID")
	private int MNGR_ID;

}
