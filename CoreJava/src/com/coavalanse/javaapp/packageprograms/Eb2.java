package com.covalanse.javaapp.packageprograms;

import java.util.logging.Logger;

public class Eb2 {
	final Logger loger = Logger.getLogger("Eb2 ");
	void receive(Employee p) {
		loger.info(p.getEmpname());
		loger.info(""+p.getEmpsal());
		loger.info(""+p.getGender());
	}

}
