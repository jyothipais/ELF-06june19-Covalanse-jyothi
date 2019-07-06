package com.covalense.javaapp.constructor;

import java.util.logging.Logger;

public class Iphone extends Phone {
	final static Logger loger = Logger.getLogger("Iphone");
	void call() {
		loger.info("calling from Iphone");
	}

}
