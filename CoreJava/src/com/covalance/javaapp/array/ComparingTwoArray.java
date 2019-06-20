package com.covalance.javaapp.array;
import java.util.Arrays;

public class ComparingTwoArray {
	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 3, 7, 1 };
		int[] b = new int[] { 5, 5, 3, 7, 1 };
		if (Arrays.equals(a, b))
			System.out.println("Same");
		else
			System.out.println("Not same");

	}

}
