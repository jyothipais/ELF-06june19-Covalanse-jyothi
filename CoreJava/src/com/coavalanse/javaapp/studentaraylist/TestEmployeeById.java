package com.covalanse.javaapp.studentaraylist;

import java.util.TreeSet;
import java.util.logging.Logger;

public class TestEmployeeById {
	final static Logger loger = Logger.getLogger("TestEmployeeById");
	public static void main(String[] args) {
		

	
	Employee a1 = new Employee();
	a1.name = "eyekiller";
	a1.id=25;
	a1.salary= 55000;
	
	Employee a2 = new Employee();
	a2.name = "sara";
	a2.id= 10;
	a2.salary =37000;
	
	Employee a3 = new Employee();
	a3.name = "nickeymol";
	a3.id= 05;
	a3.salary = 36087;
	
	Employee a4 = new Employee();
	a4.name = "minikutty";
	a4.id= 15;
	a4.salary = 40000;
		
	EmoployeeByName el=new EmoployeeByName();
	
	TreeSet<Employee> a = new TreeSet<Employee>(el);
	
	a.add(a1);
	a.add(a2);
	a.add(a3);
	a.add(a4);
	
	for(Employee e:a) {
	loger.info("name is :"+e.name);
	loger.info("id is :"+e.id);
	loger.info("salary is :"+e.salary);
	loger.info("******************************");
	}
	
	
	
	
	

	}	
	
}
