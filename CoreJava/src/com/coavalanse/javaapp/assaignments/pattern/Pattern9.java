package com.covalanse.javaapp.assaignments.pattern;

public class Pattern9 {
	public static void main(String[] args) {
		int i, j, k;
		int n=10;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= 5 - i + 1; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println("  ");
		}
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= 2 * (5 - i + 1) - 1; j++) {
				System.out.print("*");
			}
			System.out.println("  ");
		}

		
	}

}
