package com.covalense.javaapp.filehandling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Buyproduct {
	private static final Logger loger = Logger.getLogger("flipcart");
	void buy()
	{

		loger.log(Level.SEVERE, "HI im SEVERE MESSEGE");
		loger.log(Level.WARNING, "HI im WARNING MESSEGE");
		loger.log(Level.INFO, "HI im INFO MESSEGE");
		loger.log(Level.CONFIG, "HI im CONFIG MESSEGE");
		loger.log(Level.FINE, "HI im FINE MESSEGE");
		loger.log(Level.FINER, "HI im FINER MESSEGE");
		loger.log(Level.FINEST, "HI im FINEST MESSEGE");
	}

}
