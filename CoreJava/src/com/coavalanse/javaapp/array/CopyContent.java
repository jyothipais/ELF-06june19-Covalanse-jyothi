package com.covalance.javaapp.array;

import java.util.Arrays;
import java.util.logging.Logger;

public class CopyContent {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("CopyContent ");
		int[] a = { 3, 6, 4, 9, 1 };
		int[] b = Arrays.copyOf(a, a.length);
		for (int i = 0; i < b.length; i++) {
			loger.info("" + b[i]);
		}
	}

}
