package com.covalance.javaapp.inheritence;

import java.util.logging.Logger;

public abstract class Google {
	void login() {
		final Logger loger = Logger.getLogger(" Testpencil  ");
		loger.info("this is login page");
	}

	abstract void fetchdata();
}
