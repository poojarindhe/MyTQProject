package com.firstday;

import java.util.Scanner;

public class Cal_Percentage {

	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the marks of first sub1 :");
		float sub1=sc.nextFloat();
		System.out.println("Enter the marks of first sub2 :");
		float sub2=sc.nextFloat();
		System.out.println("Enter the marks of first sub3 :");
		float sub3=sc.nextFloat();
		System.out.println("Enter the marks of first sub4 :");
		float sub4=sc.nextFloat();
		System.out.println("Enter the marks of first sub5 :");
		float sub5=sc.nextFloat();
		
		float total,per;
		
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("Total marks is :"+total);
		
		per=(total/500)*100;
		System.out.println("Percentage is :"+per);
		
		
		
		

	}

}
