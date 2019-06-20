package com.covalance.javaapp.array;

import java.util.Arrays;

public class SortinArray {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 4, 1, 6, 3 };

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
