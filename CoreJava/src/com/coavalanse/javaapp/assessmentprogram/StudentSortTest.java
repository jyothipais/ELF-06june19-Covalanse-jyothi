package com.covalense.javaapp.assessmentprogram;

import java.util.TreeSet;
import java.util.logging.Logger;

public class StudentSortTest {
	final static Logger loger=Logger.getLogger("StudentPassFailTest");
	public static void main(String[] args) {

		Student s1 = new Student(2, "John", 30.00);
		Student s2 = new Student(9, "Abhay", 75.50);
		Student s3 = new Student(1, "Ria", 60.00);
		Student s4 = new Student(7, "Yogesh", 87.00);
		Student s5 = new Student(5, "Leena", 48.00);

		TreeSet<Student> ts = null;

		SortByRequest req = new SortByRequest();

		String choice = "PERC";

		switch (choice) {
		case "ROLE":
			ts = new TreeSet<>(req.sortByRoleNumber());
			break;
		case "NAME":
			ts = new TreeSet<>(req.sortByName());
			break;
		case "PERC":
			ts = new TreeSet<>(req.sortByPercentage());
			break;
		default:
			loger.info("Wrong Choice");
		}
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);

		for (Student student : ts) {
			loger.info("" + student);
		}

	}

}
