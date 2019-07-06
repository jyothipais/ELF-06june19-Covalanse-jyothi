package com.covalanse.javaapp.packageprograms;

public class Testperson {
	public static void main(String[] args) {
		Person a = new Person();
		a.setName("anitta");
		a.setTkno(05);
		Db1 d1 = new Db1();
		d1.receive(a);
	}

}
