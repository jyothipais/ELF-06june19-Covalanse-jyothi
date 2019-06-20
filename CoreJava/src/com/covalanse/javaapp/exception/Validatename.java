package com.covalanse.javaapp.exception;

public class Validatename extends RuntimeException {
	void validate(String name) throws Nameexception {
		if (name.length() <= 5) {
			System.out.println("valid name");
		} else {
			throw new Nameexception("please enter valid name");
		}
	}

}
