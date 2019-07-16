package com.covalense.springs.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.java.Log;

@Log
public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");//instansiating the container
		MessageBean messageBean = (MessageBean) applicationContext.getBean("messageBean");//getting message
		log.info("" + messageBean.getMessage());

	}

}
