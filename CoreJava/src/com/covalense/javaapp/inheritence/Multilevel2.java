package com.covalense.javaapp.inheritence;


public class Multilevel2 extends Multilevel1 {
	void level12() {
		System.out.println("im a child class content of  Multilevel1");
	}

	public static void main(String[] args) {
		Multilevel2 m = new Multilevel2();
		m.level12();
		m.level1();
		m.level0();

	}

}
