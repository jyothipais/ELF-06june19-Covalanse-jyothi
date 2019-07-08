package com.covalense.javaapp.assessmentprogram;

public class GetSingletonObjectTest {
public static void main(String[] args) {
		
		//getting an instance of the singleton class
		SingletonImplementation myObject = SingletonImplementation.getInstance();		
		myObject.doAction();		
		
		//getting an instance of the singleton class again - same instance returned
		SingletonImplementation secondObject = SingletonImplementation.getInstance();		
		secondObject.doAction();
		
	}

}
