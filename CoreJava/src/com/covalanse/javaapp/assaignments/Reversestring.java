package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Reversestring {
	final static Logger loger = Logger.getLogger("ReverseString");
	public static void main(String[] args) {
		String s = "nickeymol";
		char[] c = s.toCharArray();

		for (int i = s.length() - 1; i >= 0; i--) {
			loger.info(" "+c[i]);
		}
	}
}
