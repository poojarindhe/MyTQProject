package com.forth;

public class PrintArea {

	void area(int a)
	{
		System.out.println("Area of Sqaure =" +(a*a));
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle =" +(l*b));
	}

	public static void main(String[] args)
	{
		PrintArea a = new PrintArea();
		a.area(5);
		a.area(5.0, 2.0);

	}

}
