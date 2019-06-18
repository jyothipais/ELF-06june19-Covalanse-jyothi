package com.covalense.javaapp.interface1;
public class Person implements Animal, Human {
	public void eat() {
		System.out.println("eating");
	}

	public void walk() {
		System.out.println("walking");
	}
}
