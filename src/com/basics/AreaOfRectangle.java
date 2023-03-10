package com.basics;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the length ");
		double l=sc.nextDouble();
		
		System.out.println("enter the breadth ");
		double b=sc.nextDouble();
		
		double area=l*b;
		System.out.println("Area of Rectangle is= "+area);
		
		
	}

}
