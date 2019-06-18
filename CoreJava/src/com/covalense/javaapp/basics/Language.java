package com.covalense.javaapp.basics;

public class Language {
	public static void main(String[] args) {
		int selectedlanguage = 6;
		switch (selectedlanguage) {
		case 1:
			System.out.println("Selected Language is KANNADA");
			break;
		case 2:
			System.out.println("Selected Language is ENGLISH");
			break;
		case 3:
			System.out.println("Selected Language isHINDI");
			break;
		case 4:
			System.out.println("Selected Language isTAMIL");
			break;
		case 5:
			System.out.println("Selected Language isTELUGU");
			break;
		default:
			System.out.println("invalid option you have selected!!!!!!!!!!!!");
		}
	}

}
