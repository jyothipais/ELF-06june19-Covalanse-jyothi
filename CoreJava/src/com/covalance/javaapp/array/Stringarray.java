package com.covalance.javaapp.array;

public class Stringarray {
	public static void main(String[] args) {
		String[] s = new String[7];

		s[0] = "nickeymol";
		s[1] = "charu";
		s[2] = "eyekiller";
		s[3] = "balaji";
		s[4] = "joy";
		s[5] = "pushpa";
		s[6] = "joyly";
		for (int i = 0; i <= s.length; i++)
			System.out.println(s[i]);
		System.out.println(s.length);
	}
	/*
	 * for(int i=s.length-1;i>=0;i--) { System.out.println(s[i]); }
	 */// reverse

}
