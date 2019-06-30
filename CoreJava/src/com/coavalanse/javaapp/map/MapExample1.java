package com.coavalanse.javaapp.map;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MapExample1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("MapExample1");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);

		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			String key = e.getKey();
			Integer value = e.getValue();

			loger.info("key is......" + key);
			loger.info("valu is .......:" + value);

		}

	}

}
