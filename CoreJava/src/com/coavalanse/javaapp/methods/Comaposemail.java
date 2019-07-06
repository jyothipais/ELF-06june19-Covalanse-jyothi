package com.covalanse.javaapp.methods;

import java.util.logging.Logger;

public class Comaposemail {
	final static Logger loger = Logger.getLogger("Comaposemail");
	public static void main(String[] args) {
		Mail m = new Mail();
		m.cc = "Resume";
		m.from = "jyothi";
		m.to = "bala";
		loger.info("from" + m.from);
	}

}

class Mail {
	final static Logger loger = Logger.getLogger("Mail");
	String to, from, cc;

	void send() {
		loger.info("Mail send");
	}

	void attachment() {
		loger.info("Fail attach");
	}
}
