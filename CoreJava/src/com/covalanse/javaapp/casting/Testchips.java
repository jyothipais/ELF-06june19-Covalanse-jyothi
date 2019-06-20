package com.covalanse.javaapp.casting;

public class Testchips {
	public static void main(String[] args) {
		Chips c = new Lays();
		Lays l = (Lays) c;
		// Bingo b=(Bingo)c;
		l.eat();

	}

}
