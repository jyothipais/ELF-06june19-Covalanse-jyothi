package com.covalense.mapping.primarybean;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.covalense.mapping.bean.manytomany.TrainingInfo;
import com.covalense.mapping.bean.manytoone.EmployeeAddressInfoBean;
import com.covalense.mapping.bean.manytoone.EmployeeEducationInfo;
import com.covalense.mapping.bean.manytoone.EmployeeExperienceInfo;
import com.covalense.mapping.bean.onetoone.EmployeeOtherInfoBean;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Table(name = "employee_info")
@Data
public class EmployeeInfoBean implements Serializable {
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "employeeInfo")
	private EmployeeOtherInfoBean employeeOtherInfo;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "addressPKBean.employeeInfoBean")
	private List<EmployeeAddressInfoBean> employeeAddressInfo;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "educationPkBean.employeeInfoBean")
	private List<EmployeeEducationInfo> educationInfo;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "experiencePkBean.employeeInfoBean")
	private List<EmployeeExperienceInfo> experienceInfoBean;
	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "employeeInfo")
	private List<TrainingInfo> trainingInfoBean;
	
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "SALARY")
	private double salary;

	@Column(name = "PHONE")
	private int phone;

	@Column(name = "JOINING_DATE")
	private Date joiningDate;

	@Column(name = "ACCOUNT_NUMBER")
	private int accountNumber;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DOB")
	private Date dob;
	
	@Column(name="PASSWORD")
	private String password;
	
	  @ManyToOne(cascade = CascadeType.ALL)
	  
	  @JoinColumn(name="DEPT_ID",referencedColumnName = "DEPT_ID")
	  private DepartementInfo departementId;
	
	/* @Column(name = "DEPT_ID") private int deptId; */	 

	@ManyToOne
	@JoinColumn(name = "MNGR_ID", referencedColumnName = "ID")
	private EmployeeInfoBean managerId;
	
	
	 

}
