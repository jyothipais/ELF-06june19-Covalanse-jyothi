package com.covalense.springs.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.Data;
import lombok.extern.java.Log;

@Log
@Data
public class EmployeeBean {
	private String name;
	private int id;
	
	private DepartmentBean departmentBean=null;

	/*
	 * @Override public void destroy() throws Exception {
	 * log.info("Distroying bean"); }
	 * 
	 * @Override public void afterPropertiesSet() throws Exception {
	 * log.info("Initializing bean"); }
	 */

	/*
	 * public void init() throws Exception{ log.info("initialized phase ! ! !"); }
	 * public void destroy() throws Exception{ log.info("Destruction phase ! ! !");
	 * }
	 */

}
