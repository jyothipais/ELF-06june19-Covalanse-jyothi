package com.covalanse.javaapp.packageprograms;

import java.util.logging.Logger;

public class Db1 {
	final Logger loger = Logger.getLogger("Db1 ");
	void receive(Person p) {
		loger.info(p.getName());
		loger.info(""+p.getTkno());
	}

}
