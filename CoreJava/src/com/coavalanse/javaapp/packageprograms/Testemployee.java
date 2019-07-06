package com.covalanse.javaapp.packageprograms;

public class Testemployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpname("sarathi");
		e.setEmpsal(20000);
		e.setGender('f');
		Edb e1 = new Edb();
		e1.receive(e);
		
	}

}
