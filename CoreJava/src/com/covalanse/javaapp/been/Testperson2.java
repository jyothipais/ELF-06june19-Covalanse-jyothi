package com.covalanse.javaapp.been;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Testperson2 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		try {
			fin = new FileInputStream("smily.txt");
			oin = new ObjectInputStream(fin);
			Person p = (Person) oin.readObject();
			System.out.println("NAME  : " + p.getName());
			System.out.println("age      :" + p.getAge());
			System.out.println("id         :" + p.getId());
			oin.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (oin != null) {
				try {
					oin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

}
