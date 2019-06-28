package com.covalense.javaapp.asessment;
//Program to sort the message based on the date and time.

import java.time.LocalDateTime;
import java.util.logging.Logger;

public class MessageTest {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("SortingByDateTest");
		Message s = new Message();
		s.msg = "Good Morning";

		Message s1 = new Message();
		s1.msg = "Good Evening";

		LocalDateTime l = LocalDateTime.now();
		loger.info("The message " + s.msg + " has been sent at :" + LocalDateTime.now());

		LocalDateTime l2 = LocalDateTime.now();
		loger.info("The message " + s1.msg + " has been sent at :" + LocalDateTime.now());

		if (l.equals(l2)) {
			loger.info("Message has been sent at same time" + l.getMinute());
		} else if (l.getMinute() > l.getMinute()) {
			loger.info("Message has been sent first" + l.getMinute());
		} else {
			loger.info("Message has been sent last" + l.getMinute());
		}

	}

}
