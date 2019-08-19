package com.covalense.mapping.primarybean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "department_info")
@Data
public class DepartementInfo {
	@Id
	@Column(name = "DEPT_ID")
	private int deptId;
	@Column(name = "DEPT_NAME")
	private String deptName;
}
