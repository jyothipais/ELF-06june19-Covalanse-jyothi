package com.covalanse.javaapp.exception;

public class IRTCT extends Paytm {
	void ticket() {
		System.out.println("book the ticket");
		int a[] = new int[2];
		try {
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("make sure your array is out of boundry");
		}
	}

}
