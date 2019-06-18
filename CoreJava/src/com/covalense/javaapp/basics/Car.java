package com.covalense.javaapp.basics;

public class Car {
	public static void main(String[] args) {
		double car = 570000, rto = (14.26 * car) / 100, ins = (9.6 * car) / 100, total = car + rto + ins;
		System.out.println("car price is " + car);
		System.out.println("RTO charge is" + rto);
		System.out.println("your insurence charge is" + ins);

	}

}
