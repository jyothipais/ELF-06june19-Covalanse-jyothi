package com.covalanse.javaapp.exception;

import java.util.logging.Logger;

public class TestPaytm {
	final static Logger loger = Logger.getLogger("TestPaytm");
	public static void main(String[] args) {
		Paytm p = new Paytm();
		IRTCT i = new IRTCT();
		p.book();
		i.ticket();

		loger.info("payment done successfully");
		loger.info("booked successfully");

	}

}
