package com.covalense.javaapp.assessmentprogram;

import java.util.ArrayList;
import java.util.logging.Logger;

public class DisplayContent {
	final static Logger loger=Logger.getLogger("DisplayContent");
	public static void main(String[] args) {
		ArrayList<StudentNew> al = new ArrayList<StudentNew>();
		
		StudentNew s1 =new StudentNew("Ashutosh", "Male", 88);
		StudentNew s2 =new StudentNew("Punam", "Female", 78);
		StudentNew s3 =new StudentNew("Kavita", "Female", 68);
		StudentNew s4 =new StudentNew("Prakash", "Male", 58);
		StudentNew s5 =new StudentNew("Sonam", "Female", 89);
		


		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		al.stream().forEach(a-> loger.info(""+a.toString()));
		
	} 

}
