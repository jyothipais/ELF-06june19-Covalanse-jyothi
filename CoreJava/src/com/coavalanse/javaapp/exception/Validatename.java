package com.covalanse.javaapp.exception;

import java.util.logging.Logger;

public class Validatename extends RuntimeException {

	private static final long serialVersionUID = 1L;
	final Logger loger = Logger.getLogger("Validatename");

	void validate(String name) throws Nameexception {
		if (name.length() <= 5) {
			loger.info("valid name");
		} else {
			throw new Nameexception("please enter valid name");
		}
	}

}
