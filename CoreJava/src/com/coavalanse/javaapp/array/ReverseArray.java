//sorting string in reverse order
package com.covalance.javaapp.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.logging.Logger;

public class ReverseArray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("ReverseArray ");
		String[] a = new String[] { "charu", "nickeymol", "eyekiller" };

		Arrays.sort(a, Collections.reverseOrder());
		for (int i = 0; i < a.length; i++) {
			loger.info(a[i]);
		}
	}

}
