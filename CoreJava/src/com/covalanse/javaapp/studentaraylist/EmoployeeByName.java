package com.covalanse.javaapp.studentaraylist;

import java.util.Comparator;

public class EmoployeeByName  implements Comparator <Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		
		 
		return o1.name.compareTo(o2.name);
	}
	
	

}
