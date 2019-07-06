package com.covalanse.javaapp.assaignments;

public class Teststudent {
	public static void main(String[] args) {

		Student a = new Student();
		a.setAge(21);
		a.setBloodgroup('b');
		a.setName("anitta");
		a.setTkno(05);
		Stu1 s1 = new Stu1();
		s1.receive(a);
	}
}
