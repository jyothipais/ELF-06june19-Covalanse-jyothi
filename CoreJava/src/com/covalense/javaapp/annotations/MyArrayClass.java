package com.covalense.javaapp.annotations;

public class MyArrayClass {
	private Object[] myArray;
	private Object[] myArray1;
	private int index;

	public MyArrayClass() {
		this(20);
	}

	public MyArrayClass(int size) {
		if (size <= 0) {
			throw new ArrayIndexOutOfBoundsException("size should not be greater than 0");
		}
		myArray = new Object[size];
		index = 0;

	}

	public void add(Object val) {
		if (index > myArray.length) {
			Object[] myArray1 = new Object[30];
			System.arraycopy(myArray, 0, myArray1, 0, myArray.length);
			myArray = myArray1;
		} else {
			myArray[index] = val;
			index++;

		}

	}

	public Object get(int position) {
		return myArray[position];

	}

	public int getsize() {
		return index - 1;
	}

	public void remove(int position) {

		if (position > myArray.length) {
			throw new ArrayIndexOutOfBoundsException("position should be inside the index");
		} else {
			myArray[position] = null;

			System.arraycopy(myArray, position + 1, myArray, position, myArray.length - 1 - position);
		}

	}

}
