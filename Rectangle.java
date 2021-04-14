package com.assignment.shape.demo;

public class Rectangle extends Shape {
	
	int l=10;
	int w=5;
	public void area() {
		
	System.out.println("Area of Rectangle: "+l*w);	
	}
	
	public void periphery() {
		
		System.out.println("Periphery of Rectangle: "+l*l*w*w);
	}

}
