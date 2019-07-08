package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class HDFCBankCard implements BankCard {
	final Logger loger = Logger.getLogger("HDFCBankCard");

	public void bankName() {
		loger.info("HDFC Bank");
	}

}
