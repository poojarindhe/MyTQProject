package com.checkcondition;

import java.util.Scanner;

public class CheckNum1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else
	         if(num<0)
	         {
			System.out.println("number is negative");
	         }
			else
			{
				System.out.println(" It's a zero");
			}
		}
	}


