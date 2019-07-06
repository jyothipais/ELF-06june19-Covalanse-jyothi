package com.covalense.designpattern;

import lombok.extern.java.Log;

@Log
public class MyImmutableClassTest {
	public static void main(String[] args) {
		MyImmutableClass immutableClass=null;
		immutableClass=new MyImmutableClass("jyothi", 31, 21, 9977553311L);
		log.info("NAME IS :"+immutableClass.getName());
		log.info("ID IS :"+immutableClass.getId());
		log.info("AGE IS :"+immutableClass.getAge());
		log.info("PHONE IS :"+immutableClass.getPhone());
	}

}
