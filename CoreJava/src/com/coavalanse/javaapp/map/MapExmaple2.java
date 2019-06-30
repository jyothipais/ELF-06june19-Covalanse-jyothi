package com.coavalanse.javaapp.map;

import java.util.HashMap;
import java.util.Set;
import java.util.logging.Logger;

public class MapExmaple2 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("MapExmaple2 ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);

//only keys will display.......
		Set<String> ts = hm.keySet();
		for (String s : ts) {
			loger.info(s);

		}
	}

}
