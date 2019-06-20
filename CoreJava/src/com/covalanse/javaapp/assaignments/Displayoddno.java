package com.covalanse.javaapp.assaignments;

public class Displayoddno {
	public static void main(String[] args) {
		System.out.println("no are divisible by 7 are:");
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

	}
}
