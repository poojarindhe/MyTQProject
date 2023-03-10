package com.second;

import java.util.Scanner;

public class Display_day {

	public static void main(String[] args) 
	{
		int day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		day=sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuseday");
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
		    System.out.println("Thursday");
		break;
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Saturday");
		break;
		case 7:
			System.out.println("Sunday");
		break;
		default:
		System.out.println("invalid day");
		break;
		}
	}

}
