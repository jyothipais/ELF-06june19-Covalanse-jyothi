package com.covalense.javaapp.asessment;
//Program to create a custom exception to validate student eligibility for the exam.

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(31);
		s.setName("jyothi");
		s.setPercentage(8.7);

		s.validation();

	}

}
