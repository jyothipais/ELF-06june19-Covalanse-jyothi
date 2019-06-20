//sorting string in reverse order
package com.covalance.javaapp.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	public static void main(String[] args) {
		String[] a = new String[] {"charu","nickeymol","eyekiller"};
		
		Arrays.sort(a,Collections.reverseOrder());
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
