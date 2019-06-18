package com.covalanse.javaapp.object;

public class Teststudent {
	public static void main(String[] args) {
		Student s = new Student("bala", 21, 4.5);
		Student s1 = new Student("bala", 21, 4.5);
		s.getAge();
		s.getHeight();
		s.getName();

		System.out.println("student name is :" + s.getName());
		System.out.println("student age is :" + s.getAge());
		System.out.println("student height  is :" + s.getHeight());

		System.out.println(s.equals(s1));

	}

}
