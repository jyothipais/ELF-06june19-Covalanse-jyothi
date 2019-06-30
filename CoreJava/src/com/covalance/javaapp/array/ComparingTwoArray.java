package com.covalance.javaapp.array;

import java.util.Arrays;
import java.util.logging.Logger;

public class ComparingTwoArray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ComparingTwoArray ");
		int[] a = new int[] { 2, 5, 3, 7, 1 };
		int[] b = new int[] { 5, 5, 3, 7, 1 };
		if (Arrays.equals(a, b))
			loger.info("Same");
		else
			loger.info("Not same");

	}

}
