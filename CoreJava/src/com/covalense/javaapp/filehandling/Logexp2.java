package com.covalense.javaapp.filehandling;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Logexp2 {

	private static final Logger loger = Logger.getLogger("flipcart");

	public static void main(String[] args) {
		
		
		LogManager.getLogManager().reset();
		loger.setLevel(Level.ALL);
		
		try
		{
		
		FileHandler fh=new FileHandler("myfavlogData.log",true);
		fh.setLevel(Level.SEVERE);
		fh.setFormatter(new SimpleFormatter());
		loger.addHandler(fh);
		

		loger.log(Level.SEVERE, "HI im SEVERE MESSEGE");
		loger.log(Level.WARNING, "HI im WARNING MESSEGE");
		loger.log(Level.INFO, "HI im INFO MESSEGE");
		loger.log(Level.CONFIG, "HI im CONFIG MESSEGE");
		loger.log(Level.FINE, "HI im FINE MESSEGE");
		loger.log(Level.FINER, "HI im FINER MESSEGE");
		loger.log(Level.FINEST, "HI im FINEST MESSEGE");
		
		
		Buyproduct b=new Buyproduct();
		b.buy();
	
		System.out.println("Completed");
		
		}catch(SecurityException s) {
			s.printStackTrace();
			
			
		}catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
		
	}

}
