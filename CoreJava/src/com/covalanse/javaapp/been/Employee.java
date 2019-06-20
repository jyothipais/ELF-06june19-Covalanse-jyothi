package com.covalanse.javaapp.been;

public final class Employee {
	private final String name;
	private final int age;
	private final char gender;
	private final double height;

	public Employee(String name, int age, char gender, double height) {
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getHeight() {
		return height;
	}

}
