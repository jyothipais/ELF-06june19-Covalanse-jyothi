package com.covalense.javaapp.basics;

public class Grade {
	public static void main(String[] args) {
		double score = 45;
		if (score > 85) {
			System.out.println("grade +a");
		} else if (score > 60) {
			System.out.println("Grade is B");
		} else if (score > 35) {
			System.out.println("Grade is C");
		} else {
			System.out.println("Grade is D");
		}
	}

}
