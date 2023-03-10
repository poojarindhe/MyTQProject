package com.Opps;

public class StaticDemo {
	static int a=11;
	int b=10;
	
	public static void addition()
	{
		StaticDemo s1= new StaticDemo();
		System.out.println("addition =" +(a+s1.b));
	    	
	}

	public static void main(String[] args) 
	{
      //StaticDemo s2= new StaticDemo();
      StaticDemo.addition();
	}

}
