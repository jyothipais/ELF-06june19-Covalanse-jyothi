package com.covalense.javaapp.stream;

import java.util.logging.Logger;

public interface DemoB {
	void print(int x);

}
class PenB {
	final static Logger loger = Logger.getLogger("PenB");
void write(int x) {
		loger.info("" + x);
	}
public static void main(String[] args) {
	Pen p=new Pen();
	DemoB d=p::write;
	d.print(6);
}
}
	
	
