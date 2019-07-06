package com.covalanse.javaapp.exception;

public class Testname {
	public static void main(String[] args) {

		Validatename v = new Validatename();
		try {
			v.validate("smily");
		} catch (Nameexception e) {

			e.printStackTrace();
		}
	}

}
