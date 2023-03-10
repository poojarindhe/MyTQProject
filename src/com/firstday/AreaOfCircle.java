package com.firstday;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args)
	{
		
		double pi=3.14,area;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle :");
		int r = sc.nextInt();
		
		area=pi*r*r;
		System.out.println("Area of circle is : "+area);
		
	}

}
