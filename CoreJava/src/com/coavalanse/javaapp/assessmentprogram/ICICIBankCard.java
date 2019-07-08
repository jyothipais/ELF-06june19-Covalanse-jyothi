package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class ICICIBankCard implements BankCard {
	final Logger loger = Logger.getLogger("ICICIBankCard");

	public void bankName() {
		loger.info("ICICI Bank");
	}
}
