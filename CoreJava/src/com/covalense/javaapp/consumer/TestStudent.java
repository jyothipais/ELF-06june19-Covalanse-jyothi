package com.covalense.javaapp.consumer;

import java.util.function.Consumer;
import java.util.logging.Logger;

import lombok.extern.java.Log;

@Log
public class TestStudent {
public static void main(String[] args) {
	final Logger loger = Logger.getLogger("TestStudent  ");
	Student s1=new Student(24,22,23,"Eye_killer");
	Consumer<Student>c=s->{
		double a=(s.marks1+s.marks2+s.marks3)/3.0;
		loger.info(s.name+  "  Score :"+a);
		
	};
	c.accept(s1);
}
}
