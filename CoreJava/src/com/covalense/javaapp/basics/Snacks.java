package com.covalense.javaapp.basics;

public class Snacks {
	public static void main(String[] args) {
		int price = 50;
		switch (price) {
		case 10:
			System.out.println("lays");
			break;
		case 20:
			System.out.println("KueKure");
			break;
		case 50:
			System.out.println("Dairy Milk");
			break;
		default:
			System.out.println("INVALID OPTION!!!!!!!!!!");
		}
	}

}
