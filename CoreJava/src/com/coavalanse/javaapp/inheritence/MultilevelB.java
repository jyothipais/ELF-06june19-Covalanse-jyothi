package com.covalense.javaapp.inheritence;


public class MultilevelB extends MultilevelA {
	void level12() {
		System.out.println("im a child class content of  Multilevel1");
	}

	public static void main(String[] args) {
		MultilevelB m = new MultilevelB();
		m.level12();
		m.level1();
		m.level0();

	}

}
