package com.assignment.mathOP.demo;



public class MathOP {
	
	int a,b,c,d,e,f;
	public void sum(int a,int b)
	{
	System.out.println("Addition of 2 numbers: "+(a+b));	
	}
	public void sum(int a,int b,int c)
	{
	System.out.println("Addition Of 3 Numbers: "+(a+b+c));
	}
	
	public void complexsum(int a,int b,int c,int d)
	{
		System.out.println("Addition of 3 complex Number: "+(a+c)+"+"+((b+d)+"i"));
	}
	
	public void complexsum(int a,int b,int c,int d,int e,int f)
	{
		System.out.println("Addition of 3 complex Number: "+(a+c+e)+"+"+((b+d+f)+"i"));
	}
	
	
	public void sub(int a, int b) {
		
		System.out.println("Substraction of 2 numbers: "+(a-b));
	}
	
	public void sub(int a, int b, int c) {
		System.out.println("Substraction of 3 numbers: "+((a-b)-c));
		
	}
	
	public void complexsub(int a, int b, int c, int d) {
		System.out.println("Subtraction of 2 complex Number: "+(a-+c)+"-"+((b-d)+"i"));
		
		
	}
	
	public void complexsub(int a,int b,int c,int d,int e,int f)
	{
		System.out.println("Subtraction of 3 complex Number: "+((a-c)-e)+"-"+(((b-d)-f)+"i"));
	}
	
	
	public static void main(String[] args)
	{   
		
		
		MathOP obj=new MathOP();

		
		obj.sum(4, 6);
		obj.sum(4,5,6);
	    obj.complexsum(3, 4, 5, 6);
	    obj.complexsum(3, 4, 5, 6,7,8);
	    obj.sub(8, 5);
	    obj.sub(9, 3, 2);
	    obj.complexsub(9, 4, 3, 2);
	    obj.complexsub(8, 6, 1, 3, 3, 1);
	    
	    	}
	
	}