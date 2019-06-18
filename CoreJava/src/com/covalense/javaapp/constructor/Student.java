package com.covalense.javaapp.constructor;

public class Student {
	int tkno;
	String name;
	double percentage;

	Student(int x, String y, double z) {
		tkno = x;
		name = y;
		percentage = z;

	}

	void display() {
		System.out.println("TkNo is" + tkno);
		System.out.println("NaME is" + name);
		System.out.println("PeRcEnTaGe is" + percentage);
	}

}
