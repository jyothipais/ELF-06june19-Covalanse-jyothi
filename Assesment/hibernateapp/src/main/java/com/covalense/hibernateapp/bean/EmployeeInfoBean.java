package com.covalense.hibernateapp.bean;

import java.sql.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="employee_info")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class EmployeeInfoBean {

		@Id
		@Column(name="ID")
		private int id;
		@Column(name="NAME")
		private String Name;
		@Column(name="GENDER")
		private String gender;
		@Column(name="AGE")
		private int age;
		@Column(name="SALARY")
		private int salary;
		@Column(name="PHONE_NUMBER")
		private int phonenumber;
		@Column(name="JOINING_DATE")
		private Date joiningDate;
		@Column(name="DOB")
		private Date DateOfBirth;
		@Column(name="EMAIL")
		private String email;
		@Column(name="DESIGNATION")
		private String Designation;
		@Column(name="DEPT_ID")
		private int deptId;
		@Column(name="MANAGERID")
		private int managerId;
		@Column(name="PASSWORD")
		private int password;
}
