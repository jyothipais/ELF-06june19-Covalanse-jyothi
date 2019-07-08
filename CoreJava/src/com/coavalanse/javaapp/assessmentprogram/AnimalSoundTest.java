package com.covalense.javaapp.assessmentprogram;

public class AnimalSoundTest {
	public static void main(String[] args) {
		Animal a;
		Cat c = new Cat();
		Dog d = new Dog();
		AnimalSound s = new AnimalSound();
		// passing object of Cat class
		s.getSound(c);
		// passing object of Dog class
		s.getSound(d);

	}

}
