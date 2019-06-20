package com.covalanse.javaapp.assaignments;

public class Prime {
	public static void main(String[] args) {
		int i = 0;
		int num = 0;
		String primenumbers = "";
		for (i = 0; i <= 100; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) {
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				primenumbers = primenumbers + i + "";
			}
		}
		System.out.println("prime no are:");
		System.out.println(primenumbers);
	}

}
