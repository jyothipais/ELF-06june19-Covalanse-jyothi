package com.covalanse.javaapp.packageprograms;

import java.util.logging.Logger;

public class Edb {
	final Logger loger = Logger.getLogger("Edb ");
	void receive(Employee p) {
		loger.info(p.getEmpname());
		loger.info(""+p.getEmpsal());
		loger.info(""+p.getGender());
	}

}
