package com.covalance.javaapp.array;

public class CopyingToIndex {
	static int j = 0;

	public static void main(String[] args) {
		int a[] = { 5, 6, 2, 1, 4 };
		int b[] = { 30, 40, 50, 60, 70, 80 };
		for (int i = 2; i < b.length; i++) {
			System.out.println(b[i] = a[j++]);
		}

		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k] = b[k++]);
		}
	}
}
