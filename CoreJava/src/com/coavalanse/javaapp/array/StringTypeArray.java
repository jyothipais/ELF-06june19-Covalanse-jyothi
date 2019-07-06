package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class StringTypeArray {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("StringTypeArray ");
		String[] a= {"charu","nickeymol","eyekiller"};

		
		for(String r:a) {
			loger.info(r);
		}
	}
}
