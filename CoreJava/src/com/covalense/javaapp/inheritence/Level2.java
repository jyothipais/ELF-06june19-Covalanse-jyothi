package com.covalense.javaapp.inheritence;

public class Level2 extends Level1 {
	void speed() {
		System.out.println("car is running at the speed o0-200");

	}

	public static void main(String[] args) {
		Level2 l = new Level2();
		l.speed();
	}
}
