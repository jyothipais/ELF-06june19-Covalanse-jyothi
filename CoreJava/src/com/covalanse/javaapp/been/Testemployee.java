package com.covalanse.javaapp.been;

public class Testemployee {
	public static void main(String[] args) {
		Employee e = new Employee("sarathi", 18, 'f', 3.5);
		e.getAge();
		e.getGender();
		e.getHeight();
		e.getName();
		System.out.println("the name is:" + e.getName());

		System.out.println("the age is:" + e.getAge());
		System.out.println("the age is:" + e.getGender());
		System.out.println("the age is:" + e.getHeight());

	}

}
