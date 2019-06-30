package com.covalense.javaapp.implementinglamda;

import java.util.Comparator;

public class EmployeeById  implements Comparator<EmployeeId>{
	@Override
	public int compare(EmployeeId e, EmployeeId f) {
		if (e.getId() > f.getId()) {
			return 1;
		} else if (e.getId() < f.getId()) {
			return -1;
		} else {
			return 0;
		}

	}

}
