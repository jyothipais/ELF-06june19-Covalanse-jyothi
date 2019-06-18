package com.covalense.javaapp.inheritence;
public class Son extends Overiding {
	void bike() {
		System.out.println("Modified Bike");
	}

	public static void main(String[] args) {
		Overiding o = new Son();
		o.bike();
	}
}
