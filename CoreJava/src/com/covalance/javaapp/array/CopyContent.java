package com.covalance.javaapp.array;
import java.util.Arrays;

public class CopyContent {
	public static void main(String[] args) {
		int[] a= {3,6,4,9,1};
		int[] b=Arrays.copyOf(a,a.length);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
