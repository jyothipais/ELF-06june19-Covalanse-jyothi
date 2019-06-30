package com.covalense.javaapp.interfaceprograms;

import java.util.logging.Logger;

public class SBI implements ATMcard {
	final Logger loger = Logger.getLogger("SBI");

	public void validate() {
		loger.info("validation done in SBI bank");
	}

	public void getdata() {
		loger.info("data received by the  SBI bank");
	}
}
