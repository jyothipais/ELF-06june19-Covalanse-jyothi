package com.covalense.employeemvc.dto;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "employeeInfo")
	private EmployeeOtherInfoBean employeeOtherInfo;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "addressPKBean.employeeInfoBean")
	private List<EmployeeAddressInfoBean> employeeAddressInfo;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "educationPkBean.employeeInfoBean")
	private List<EmployeeEducationInfo> educationInfo;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "experiencePkBean.employeeInfoBean")
	private List<EmployeeExperienceInfo> experienceInfoBean;

	/*
	 * @ManyToMany(cascade = CascadeType.ALL,mappedBy = "employeeInfo") private
	 * List<TrainingInfo> trainingInfoBean;
	 */

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private Integer age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SALARY")
	private Double salary;

	@Column(name = "PHONE")
	private Integer phone;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "ACCOUNT_NUMBER")
	private Integer accountNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DOB")
	private Date dob;

	@Column(name = "PASSWORD")
	private String password;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPT_ID", referencedColumnName = "DEPT_ID")
	private DepartementInfo departementId;

	@ManyToOne
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "ID")
	private EmployeeInfoBean managerId;

}
