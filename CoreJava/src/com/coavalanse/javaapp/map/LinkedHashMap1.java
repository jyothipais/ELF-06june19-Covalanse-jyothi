package com.coavalanse.javaapp.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("LinkedHashMap1");
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
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
