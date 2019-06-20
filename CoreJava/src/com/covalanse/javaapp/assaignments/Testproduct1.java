package com.covalanse.javaapp.assaignments;

public class Testproduct1 {
	public static void main(String[] args) {

		Product1 p = new Product1("pencil", 20, 10);
		// Product p1=new Product("book", 21, 25.8);
		p.getP_no();
		p.getP_bill();
		p.getP_name();

		System.out.println("Product name is :" + p.getP_name());
		System.out.println("Product age is :" + p.getP_no());
		System.out.println("Product height  is :" + p.getP_bill());

		// System.out.println(s.equals(s1));

	}
}
