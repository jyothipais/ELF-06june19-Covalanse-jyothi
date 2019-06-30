package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

public class Gmail extends Google {
	final Logger loger = Logger.getLogger(" Testpencil  ");

	void fetchdata() {
		loger.info("fetching data from database to gmail");
	}
}
