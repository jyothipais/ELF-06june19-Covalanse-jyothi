package com.covalanse.javaapp.been;

import java.util.logging.Logger;

public class Testemployee {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Testemployee ");
		Employee e = new Employee("sarathi", 18, 'f', 3.5);
		e.getAge();
		e.getGender();
		e.getHeight();
		e.getName();
	loger.info("the name is:" + e.getName());

	loger.info("the age is:" + e.getAge());
		loger.info("the age is:" + e.getGender());
	loger.info("the age is:" + e.getHeight());

	}

}
