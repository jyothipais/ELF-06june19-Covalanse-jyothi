package com.covalanse.javaapp.exception;

public class TestPaytm {
	public static void main(String[] args) {
		Paytm p = new Paytm();
		IRTCT i = new IRTCT();
		p.book();
		i.ticket();

		System.out.println("payment done successfully");
		System.out.println("booked successfully");

	}

}
