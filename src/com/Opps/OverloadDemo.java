package com.Opps;

public class OverloadDemo 
{
	void area(int a)
	{
		System.out.println("Area of Sqaure =" +(a*a));
	}
	void area(double r)
	{
		double z=3.14*r*r;
		System.out.println("Area of circle =" +z);
		
	}
	void area(double l,double b)
	{
		System.out.println("Area of Rectangle =" +(l*b));
	}
	void area(int h,int b)
	{
		System.out.println("Area of Triangle =" +(h*b/2));
	}
	public static void main(String[] args) 
	{
      OverloadDemo o = new OverloadDemo();
      o.area(5);
      o.area(2.0);
      o.area(5.0, 6.0);
      o.area(4, 7);
	}

}
