package com.covalanse.javaapp.package1;

public class Testperson {
	public static void main(String[] args) {
		Person a = new Person();
		a.setName("anitta");
		a.setTkno(05);
		Db1 d1 = new Db1();
		d1.receive(a);

		Db2 d2 = new Db2();
	}

}
