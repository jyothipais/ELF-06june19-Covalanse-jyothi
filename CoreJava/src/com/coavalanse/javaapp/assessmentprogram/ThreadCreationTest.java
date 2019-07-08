package com.covalense.javaapp.assessmentprogram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadCreationTest {
	public static void main(String[] args) {

		ThreadCreation t = new ThreadCreation();
		Thread th = new Thread(t);
		Thread th1 = new Thread(t);
		Thread th2 = new Thread(t);
		Thread th3 = new Thread(t);
		Thread th4 = new Thread(t);

		ExecutorService e = Executors.newFixedThreadPool(2);
		e.execute(th);
		e.execute(th1);
		e.execute(th2);
		e.execute(th3);
		e.execute(th4);

		e.shutdown();
	}

}
