package com.covalance.javaapp.array;

import java.util.Arrays;
import java.util.logging.Logger;

public class SortinArray {

	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("SortinArray ");
		int[] a = new int[] { 2, 4, 1, 6, 3 };

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			loger.info("" + a[i]);
		}
	}

}
