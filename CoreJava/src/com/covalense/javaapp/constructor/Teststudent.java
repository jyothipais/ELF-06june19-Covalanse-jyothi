package com.covalense.javaapp.constructor;
public class Teststudent {
	public static void main(String[] args) {
		Student s = new Student(31, "EYEKILLE", 86.8);
		s.display();
		System.out.println("----------------------------------------------------------------------------");
		Student s1 = new Student(74, "CHARU", 93.5);
		s1.display();
		System.out.println("----------------------------------------------------------------------------");
		Student s2 = new Student(05, "NICKEY MOL", 65.7);
		s2.display();
	}
}
