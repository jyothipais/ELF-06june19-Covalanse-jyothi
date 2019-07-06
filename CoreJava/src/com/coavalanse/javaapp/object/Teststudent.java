package com.covalanse.javaapp.object;

import java.util.logging.Logger;

public class Teststudent {
	final static  Logger loger = Logger.getLogger("Teststudent");
	public static void main(String[] args) {
		Student s = new Student("bala", 21, 4.5);
		Student s1 = new Student("bala", 21, 4.5);
		s.getAge();
		s.getHeight();
		s.getName();

		loger.info("student name is :" + s.getName());
		loger.info("student age is :" + s.getAge());
		loger.info("student height  is :" + s.getHeight());

		loger.info(""+s.equals(s1));

	}

}
