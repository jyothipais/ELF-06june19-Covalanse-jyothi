package com.covalense.javaapp.assessmentprogram;

import java.util.logging.Logger;

public class Train {
	final static Logger loger=Logger.getLogger("StudentPassFailTest");
	private String name;
	private int id;

	void search(String s) {
		loger.info("Searching a train by name");
	}

	void search(int id) {
		loger.info("Searching a train by number");
	}

}
