package com.covalense.javaapp.implementinglamda;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class TestEmployeeId {
	public static void main(String[] args) {
		final  Logger loger = Logger.getLogger("TestEmployeeId");
		EmployeeId e1=new EmployeeId("jyothi",31,15.500);
		EmployeeId e2=new EmployeeId("sara",74,18.500);
		EmployeeId e3=new EmployeeId("anitta",05,19.500);
	
		Comparator<EmployeeId> c=(e,f)->e.name.compareTo(f.name);
		
		TreeSet<EmployeeId > ts=new TreeSet<EmployeeId > ();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		for(EmployeeId p:ts) {
			loger.info(""+p.name);
			loger.info(""+p.id);
			loger.info(""+p.sal);
		}
	}

}
