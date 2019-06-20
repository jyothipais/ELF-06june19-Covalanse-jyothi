package com.covalance.javaapp.array;

public class Chararray {
	public static void main(String[] args) {
		char[] c = new char[8];

		c[0] = 'j';
		c[1] = 'y';
		c[2] = 'o';
		c[3] = 't';
		c[4] = 'h';
		c[5] = 'i';
		for (int i = 0; i <= c.length; i++)
			System.out.print(c[i]);
		System.out.println(c.length);
	}

}
