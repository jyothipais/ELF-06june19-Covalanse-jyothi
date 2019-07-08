package com.covalense.javaapp.assessmentprogram;

import java.util.ArrayList;
import java.util.logging.Logger;

public class ObjectContentDisplay {
	final static Logger loger=Logger.getLogger("ObjectContentDisplay");
	public static void main(String[] args) {

		StudentObject ob1 = new StudentObject(10, "mohib", 50);

		ArrayList<StudentObject> al = new ArrayList<>();
		al.add(ob1);

		al.stream().forEach(a -> loger.info("" + a.toString()));
	}

}
