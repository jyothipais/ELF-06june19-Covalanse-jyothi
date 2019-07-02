package com.covalense.jdbcapp.commonprogram;

public class DriveManager {
	private DriveManager() {
	}
	
		public static Connection getInstance(String str)
		{
			Connection ref=null;
			if(str.equals("one")) {
				 ref=new ClassA();
			}else {
				ref=new ClassB();
			}
			return ref;
		}
	

}
