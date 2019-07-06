package com.covalanse.javaapp.been;

import java.util.logging.Logger;

public class TestEmployeeBeen3 {

	private static final Logger log = Logger.getLogger("TestEmployeeBeen3");

	public static void main(String[] args) {
		EmployeeBeen3 e1 = new EmployeeBeen3();
		log.info("without Lombok..........." + e1.toString());

		EmployeeBeen3 e2 = new EmployeeBeen3();
		e2.setAge(21);
		log.info("with Lombok..........." + e2.toString());

	}
}
