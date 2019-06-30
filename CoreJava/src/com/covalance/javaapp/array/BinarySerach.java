package com.covalance.javaapp.array;
import java.util.Arrays;
import java.util.logging.Logger;

public class BinarySerach {

	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("BinarySerach ");
		int[] a= {3,6,4,9,1};
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			loger.info("a[i]");
		}
		
	}
}
