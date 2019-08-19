package com.covalense.mapping.bean.manytomany;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.covalense.mapping.primarybean.EmployeeInfoBean;

import lombok.Data;

@Data
@Entity
@Table(name = "training_info")
public class TrainingInfo implements Serializable {
	@Id
	@Column(name = "COURSE_ID")
	private int courseId;
	@Column(name = "COURSE_NAME")
	private String courseName;
	@Column(name = "DURATION")
	private String duration;
	@Column(name = "TYPE")
	private String type;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_training", 
	joinColumns = { @JoinColumn(name = "COURSE_ID") },
	inverseJoinColumns = {	@JoinColumn(name = "ID") })
	List<EmployeeInfoBean> employeeInfo;

}
