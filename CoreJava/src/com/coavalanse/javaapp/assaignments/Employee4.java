package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Employee4 {
	final Logger loger = Logger.getLogger("Employee4  ");
	void search(int id) {
		// id
		loger.info("searching by  using id");
	}

	void search(String name) {
		// Like
		loger.info("searching by using name");
	}

}
