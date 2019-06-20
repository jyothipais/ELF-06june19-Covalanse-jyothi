package com.covalanse.javaapp.assaignments;

public class Primeornot {
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int n = 3;
		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + "is not prime no");
		} else {
			for (i = 2; i <= m; i++) {
				System.out.println(n + "is not prime no");
				flag = 1;
				break;
			}
			if (flag == 0) {
				System.out.println(n + "is prime number");
			}
		}
	}
}
