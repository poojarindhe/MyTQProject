package com.firstday;

import java.util.Scanner;

public class ConvertDays {

	public static void main(String[] args)
	{
		int D,year,week,day;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers of days :");
		D=sc.nextInt();
		
		year=D/365;
		D=D%365;
		System.out.println("no of years :"+year);
		
		week=D/7;
		D=D%7;
		System.out.println("no of weeks is :"+week);
		
		day=D;
		System.out.println("no od days is :"+day); 
	}

}
