package com.covalense.javaapp.constructor;
public class Testemployee {
	public static void main(String[] args) {
		Employee e = new Employee("jyothi", 31, 15000);
		e.display();
		System.out.println("******************************************************");
		Employee e1 = new Employee("sarathi", 74, 25000);
		e1.display();
	}
}
