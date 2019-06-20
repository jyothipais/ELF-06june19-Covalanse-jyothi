package com.covalanse.javaapp.assaignments;

public class Testbottle {
	public static void main(String[] args) {
		Bottle b = new Bottle("pink", 20, 31);
		// Product p1=new Product("book", 21, 25.8);
		b.getB_no();
		b.getB_bill();
		b.getB_color();

		System.out.println("Bottle color is :" + b.getB_color());
		System.out.println("Bottle no is :" + b.getB_no());
		System.out.println("Bottle cost  is :" + b.getB_bill());

		// System.out.println(s.equals(s1));

	}
}
