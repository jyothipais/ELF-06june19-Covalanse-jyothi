package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class TestEmployeeBeen {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("TestEmployeeBeen ");
		EmployeeBeen[] emp = new EmployeeBeen[5];

		EmployeeBeen e1 = new EmployeeBeen();
		e1.setAge(20);
		e1.setName("Eye Killer");
		e1.setSal(15.500);

		EmployeeBeen e2 = new EmployeeBeen();
		e2.setAge(22);
		e2.setName("Nickey Mol");
		e2.setSal(12.500);

		EmployeeBeen e3 = new EmployeeBeen();
		e3.setAge(18);
		e3.setName("chaaru");
		e3.setSal(18.500);

		EmployeeBeen e4 = new EmployeeBeen();
		e4.setAge(22);
		e4.setName("Jashu");
		e4.setSal(19.500);

		EmployeeBeen e5 = new EmployeeBeen();
		e5.setAge(20);
		e5.setName("ashi");
		e5.setSal(15.500);

		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;

		for (EmployeeBeen r : emp) {
			loger.info("name is  :" + r.getName());
			loger.info("age is      :" + r.getAge());
			loger.info("salary is :" + r.getSal());
			loger.info("************************************************");

		}

	}

}
