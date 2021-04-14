package com.assigment.complex.demo;

public class Complex_A extends A {
	
	
	//Complex Number is a+bi; where i is imaginary number;
	
	double real1=6.8;
	double real2=3.4;
	double img1=7.8;
	double img2=5.7;
	
	


public void sum() {
	
	System.out.println(((real1+real2)+"+"+((img1+img2)+"i")));
	
}

public void sub() {
	
	System.out.println(((real1-real2)+"+"+((img1-img2)+"i")));
}

}
