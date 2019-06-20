package com.covalanse.javaapp.assaignments;

public class Evenby5 {
	public static void main(String[] args) {
		System.out.println("no are divisible by 5 are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i % 5 == 0) {
					System.out.println(i);
				}
			}
		}
	}

}
