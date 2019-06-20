package com.covalanse.javaapp.been;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Testperson {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
		p.setId(31);
		p.setName("smily");

		try {
			FileOutputStream fout = new FileOutputStream("smily.txt");
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			obj.writeObject(p);
			obj.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
