 package com.checkcondition;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("You have Adhar Card");
		char ch = sc.next().charAt(0);
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
		if(age>18 && ch=='y'||ch=='N')
		{
			System.out.println("you are eligible for driving license");
		}
		else  
		{
			System.out.println("you are not eligible for driving license");
		}
	}

}
