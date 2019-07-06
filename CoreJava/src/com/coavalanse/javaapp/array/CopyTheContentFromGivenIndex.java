package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class CopyTheContentFromGivenIndex {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("CopyTheContentFromGivenIndex  ");
		int[] a = { 3, 6, 4, 9, 1 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		System.arraycopy(a, 1, b, 2, 2);
		for (int i = 0; i < b.length; i++) {
			loger.info(b[i] + " ");
		}
	}

}
