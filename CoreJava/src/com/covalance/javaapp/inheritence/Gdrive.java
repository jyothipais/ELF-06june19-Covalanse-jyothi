package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

public class Gdrive extends Google {
	final Logger loger = Logger.getLogger(" Testpencil  ");

	void fetchdata() {
		loger.info("fetching the data from database of gdrive");
	}
}
