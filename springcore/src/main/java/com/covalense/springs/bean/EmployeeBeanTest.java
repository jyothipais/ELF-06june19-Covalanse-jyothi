package com.covalense.springs.bean;

import java.util.Scanner;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class EmployeeBeanTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("employeebean.xml");
		EmployeeBean employeeBean = (EmployeeBean) applicationContext.getBean("employeeBean");
		/*
		 * log.info("ID is :" + employeeBean.getId()); log.info("NAME is :" +
		 * employeeBean.getName());
		 * 
		 * EmployeeBean employeeBean2 = (EmployeeBean)
		 * applicationContext.getBean("employeeBean");
		 * log.info(""+employeeBean2.getId()); log.info(""+employeeBean2.getName());
		 */
		
		
		/*
		 *taking i/p from user
 		 * Scanner scanner=new Scanner(System.in); log.info("Enter ID :");
		 * employeeBean.setId(scanner.nextInt()); log.info("Enter Nmae :");
		 * employeeBean.setName(scanner.next());
		 * 
		 * EmployeeBean employeeBean2=(EmployeeBean)
		 * applicationContext.getBean("employeeBean"); log.info("Enter ID :");
		 * employeeBean2.setId(scanner.nextInt()); log.info("Enter Nmae :");
		 * employeeBean2.setName(scanner.next());
		 */
		
		log.info(""+employeeBean.getId());
		log.info(""+employeeBean.getName());
		/*
		 * log.info(""+employeeBean2.getId()); log.info(""+employeeBean2.getName());
		 */
		log.info(""+employeeBean.getDepartmentBean());
		
		((AbstractApplicationContext )applicationContext).close();
		
	}

}
