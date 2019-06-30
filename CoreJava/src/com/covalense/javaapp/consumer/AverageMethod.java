package com.covalense.javaapp.consumer;

public class AverageMethod {
void calculate(int a,int b,int c) {
	double r=(a+b+c)/3.0;
	System.out.println(r);
}
void factorial(int f) {
	int fact=1;
	for(int i=0;i<=f;i++) {
		f=f*i;
	}
}
}
