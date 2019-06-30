package com.coavalanse.javaapp.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class MapExampleDouble1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("MapExampleDouble1 ");
		HashMap<Character, Double> hm = new HashMap<Character, Double>();
		hm.put('a', 1.7);
		hm.put('b', 5.2);
		hm.put('c', 4.3);
		hm.put('d', 5.4);
		hm.put('e', 8.5);

		for (Entry<Character, Double> e : hm.entrySet()) {
			Character key = e.getKey();
			Double value = e.getValue();

			loger.info("key is......" + key);
			loger.info("valu is .......:" + value);
			loger.info("................................................");

		}
	}

}
