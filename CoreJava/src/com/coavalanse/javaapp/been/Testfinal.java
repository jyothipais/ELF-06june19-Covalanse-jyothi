package com.covalanse.javaapp.been;

import java.util.logging.Logger;

public class Testfinal {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("Testfinal");
		Final f = new Final("anitta", 21);
		f.getName();
		f.getAge();
	loger.info("the name is:" + f.getName());

	loger.info("the age is:" + f.getAge());
	}

}
