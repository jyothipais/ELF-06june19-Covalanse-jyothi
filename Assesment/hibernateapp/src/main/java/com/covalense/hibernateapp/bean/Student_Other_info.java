package com.covalense.hibernateapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_other_info")
public class Student_Other_info {
	@Id
	@Column(name="rollno")
	private int rollno;
	@Column(name="fatherName")
	private String fatherName;
	@Column(name="MotherName")
	private String MotherName;
	@Column(name="riligion")
	private String riligion;
	@Column(name="nationality")
	private String nationality;

}
