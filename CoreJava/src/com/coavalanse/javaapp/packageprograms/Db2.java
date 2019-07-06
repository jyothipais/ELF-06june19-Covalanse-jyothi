package com.covalanse.javaapp.packageprograms;

import java.util.logging.Logger;

public class Db2 {
	final Logger loger = Logger.getLogger("Db2");
	void receive(Person p) {
		loger.info(p.getName());
		loger.info(""+p.getTkno());
	}

}
