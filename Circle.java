package com.assignment.shape.demo;

public class Circle extends Shape {

	int r=5;
	
	public void area() {
		
		System.out.println("Area of Circle: "+pi*r*r);
	}
	
	public void periphery() {
		
		System.out.println("Periphery of Circle: "+2*pi*r);
		
	}
	
}
