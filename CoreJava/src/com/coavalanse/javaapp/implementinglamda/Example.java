package com.covalense.javaapp.implementinglamda;

import java.util.logging.Logger;

public class Example implements Runnable{
	final static Logger loger = Logger.getLogger(" Example");
	@Override
	public void run() {
			Runnable x=()->{
				for(int i=0;i<=5;i++) {
					loger.info(""+i);
				}
			};
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
						e.printStackTrace();
			}
	}
	

}
