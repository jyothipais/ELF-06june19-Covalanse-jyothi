package com.covalense.javaapp.assessmentprogram;

import java.util.function.Predicate;
import java.util.logging.Logger;

public class StudentPassFailTest {
	final static Logger loger=Logger.getLogger("StudentPassFailTest");
	public static void main(String[] args) {
		Student s = new Student(2, "John", 30.00);

		Predicate<Student> p = st -> st.getPercentage() > 35;
		boolean res = p.test(s);
		if (res) {
			loger.info(s.getName() + " is pass");
		} else {
			loger.info(s.getName() + " is Failed");
		}
	}

}
