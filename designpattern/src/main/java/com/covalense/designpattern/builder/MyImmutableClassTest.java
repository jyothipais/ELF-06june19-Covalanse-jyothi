package com.covalense.designpattern.builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.covalense.designpattern.builder.EmployeeData2.EmployeeData2builder;
import com.covalense.designpattern.builder.EmployeeData3.EmployeeData3Builder;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) throws ParseException {
		/*
		 * MyImmutableClass immutableClass=null; immutableClass=new
		 * MyImmutableClass("jyothi", 31, 21, 9977553311L);
		 * log.info("NAME IS :"+immutableClass.getName());
		 * log.info("ID IS :"+immutableClass.getId());
		 * log.info("AGE IS :"+immutableClass.getAge());
		 * log.info("PHONE IS :"+immutableClass.getPhone());
		 */
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date=format.parse("2013-02-03");
		
		  EmployeeData employeeData=new EmployeeData(3, "jyothi",
		  21,"female",12.500,963553132,date,332244556,"flaviyajyothi0114@gmail.com",
		  "SoftwareDeveloper",date,1,74);
		  
		  
		  log.info("Employee Data  :"+employeeData.toString());
		 
		
		EmployeeData2 data2=new EmployeeData2
											.EmployeeData2builder()
											.ID(3).NAME("jyothi")
											.AGE(21)										  
										    .GENDER("female")
										    .SALARY(12.500)
										    .PHONE(963553132)
										    .JOINING_DATE(date)
										    .EMAIL("flaviyajyothi0114@gmail.com")
										    .DESIGNATION("SoftwareDeveloper")
										    .DOB(date)
										    .DEPT_ID(1)
										   .MNGR_ID(74)
										   .build();
		log.info(""+data2.toString());
		
		
		EmployeeData3 data3=new EmployeeData3
				.EmployeeData3Builder()
				.ID(3).NAME("jyothi")
				.AGE(21)										  
			    .GENDER("female")
			    .SALARY(12.500)
			    .PHONE(963553132)
			    .JOINING_DATE(date)
			    .EMAIL("flaviyajyothi0114@gmail.com")
			    .DESIGNATION("SoftwareDeveloper")
			    .DOB(date)
			    .DEPT_ID(1)
			   .MNGR_ID(74)
			   .build();
log.info(""+data3.toString());
	}

}
