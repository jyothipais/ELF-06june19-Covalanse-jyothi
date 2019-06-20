package com.covalance.javaapp.inheritence;

public class Testgoole {
	public static void main(String[] args) {
		Browser b = new Browser();
		Gmail g = new Gmail();
		Gdrive gd = new Gdrive();
		b.open(g);

	}

}
