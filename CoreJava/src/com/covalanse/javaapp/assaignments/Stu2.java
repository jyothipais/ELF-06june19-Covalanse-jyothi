package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Stu2 {
	final Logger loger = Logger.getLogger("Stu2");
	void receive(Student s) {
		loger.info(""+s.getAge());

		loger.info(""+s.getBloodgroup());
		loger.info(""+s.getName());
		loger.info(""+s.getTkno());
	}

}
