package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class ATMMachine {
	final Logger loger = Logger.getLogger("ATMMachine");

	void receive(BankCard b) {

		if (b instanceof HDFCBankCard) {
			loger.info("HDFc Bank card");
		} else if (b instanceof ICICIBankCard) {
			loger.info("ICICI Bank Card");
		}
	}

}
