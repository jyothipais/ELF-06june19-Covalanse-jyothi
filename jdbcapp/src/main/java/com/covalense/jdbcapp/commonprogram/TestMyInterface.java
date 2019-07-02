package com.covalense.jdbcapp.commonprogram;

public class TestMyInterface {
	public static void main(String[] args) {
		//MyInterface ref=new ClassA();
		Connection ref=DriveManager.getInstance(args[0]);
		ref.printMessage();
	}

}
