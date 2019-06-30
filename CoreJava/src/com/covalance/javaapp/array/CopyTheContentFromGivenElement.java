package com.covalance.javaapp.array;

import java.util.logging.Logger;

public class CopyTheContentFromGivenElement {
public static void main(String[] args) {
	final Logger loger = Logger.getLogger("CopyTheContentFromGivenElement");
	int[] a= {3,6,4,9,1};
	int b[]= {30,40,50,60,70,80};

	
	int givenindex=1;
	int givenno=1;
	int c= givenindex+givenno;
	int k=0;
	for(int i=givenindex;i<b.length;i++) {
		b[i]=a[givenno++];
		int element = 2;
		if(k==element) {
			break;
		}
		k++;
		
		//System.out.println(b[i]);
	}
	for(int j=0;j<b.length;j++) {
		loger.info(""+b[j]);
	}
	
	
}
}
