package com.covalanse.javaapp.been;

import java.util.logging.Logger;

public class Variable {
	final Logger loger = Logger.getLogger("Variable");
	int id = 10;

	void display() {
		loger.info("id is" + id);

	}

	public static void main(String[] args) {

	}
}
