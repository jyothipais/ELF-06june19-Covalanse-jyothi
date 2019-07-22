package com.covalense.hibernateapp.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="student_info")
public class Student_info {
	@Id
	@OneToOne
	@Column(name="rollno")
	private int rollno;
	@Column(name="name")
	private String name;
	@Column(name="age")
	private	int age;
	@Column(name="gender")
	private String gender;
	@Column(name="mobileno")
	private long mobileno;
	@Column(name="enailid")
	private String enailid;

}
