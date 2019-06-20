
package com.covalanse.javaapp.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		
		a.add(12);
		a.add("eyekiller");
		a.add(22.5);
		a.add('B');
		
		
		Iterator it=a.iterator();
			while(it.hasNext()) {
				Object r=it.next();
				System.out.println(r);
		}
		
		
	}

}
