package com.covalanse.javaapp.assaignments;

import java.util.logging.Logger;

public class Stu1 {
	final Logger loger = Logger.getLogger("Stu1 ");
	void receive(Student s) {
		loger.info(""+s.getName());
		loger.info(""+s.getAge());
		loger.info(""+s.getBloodgroup());
		loger.info(""+s.getTkno());
	}

}
