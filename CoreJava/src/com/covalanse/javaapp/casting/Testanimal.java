package com.covalanse.javaapp.casting;

public class Testanimal {
	public static void main(String[] args) {
		Animal a = new Cow();
		a.eat();
		Cow c = (Cow) a;
		c.eat();
		c.run();
		c.i = 5;
		c.j = 44;
		System.out.println(c.i);
		System.out.println(c.j);

	}

}
