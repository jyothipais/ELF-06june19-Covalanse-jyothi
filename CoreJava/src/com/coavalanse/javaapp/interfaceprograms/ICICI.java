package com.covalense.javaapp.interfaceprograms;

import java.util.logging.Logger;

public class ICICI implements ATMcard {
	final Logger loger = Logger.getLogger("ICICI");

	public void validate() {
		loger.info("validation done in ICICI bank");
	}

	public void getdata() {
		loger.info("data received by the ICICI bank");
	}
}
