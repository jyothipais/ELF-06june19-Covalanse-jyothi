package com.coavalanse.javaapp.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.logging.Logger;

public class MapExample3 {
	public static void main(String[] args) {
		final Logger loger = Logger.getLogger("MapExample3");
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();
		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);
		hm.put("five", 5);

		loger.info("*********keys**********");
		// only keys will display..........
		Set<String> ts = hm.keySet();
		for (String s : ts) {
			loger.info(s);
		}

		loger.info("*********values**********");
		// only values will display.......
		Collection<Integer> c = hm.values();
		Iterator<Integer> it = c.iterator();
		while (it.hasNext()) {
			Integer r = it.next();
		loger.info(""+r);
		}

	}

}
