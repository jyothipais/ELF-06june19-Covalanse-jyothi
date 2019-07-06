package com.covalense.javaapp.interfaceprograms;

import java.util.logging.Logger;

public class HDFC implements ATMcard {
	final Logger loger = Logger.getLogger("HDFC");

	public void validate() {
		loger.info("validation done in HDFC bank");
	}

	public void getdata() {
		loger.info("data received by the  HDFC bank");
	}
}
