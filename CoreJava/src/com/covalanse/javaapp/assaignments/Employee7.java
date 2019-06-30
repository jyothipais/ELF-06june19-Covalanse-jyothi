package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Employee7 {
	final Logger loger = Logger.getLogger("Employee7  ");
	void search(int id) {
		// id
		loger.info("searching by  using id");
	}

	void search(String name) {
		// Like
		loger.info("searching by using name");
	}

}
