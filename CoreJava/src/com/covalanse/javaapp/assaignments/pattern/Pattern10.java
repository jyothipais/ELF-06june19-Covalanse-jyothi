package com.covalanse.javaapp.assaignments.pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 3 || i == (n / 2)) {
					System.out.print("*");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("   ");
		}

	}

}
