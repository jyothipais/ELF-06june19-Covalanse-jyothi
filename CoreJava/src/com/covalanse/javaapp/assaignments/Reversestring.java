package com.covalanse.javaapp.assaignments;

public class Reversestring {
	public static void main(String[] args) {
		String s = "nickeymol";
		char[] c = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(c[i]);
		}
	}
}
