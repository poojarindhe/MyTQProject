package com.logical;

import java.util.Scanner;

public class SumOddNo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		int digit=0;
		while(num>0)
		{
			int temp=num;
			digit =temp%10;
			
			if(digit%2!=0)
			{
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println("Odd num sum is " +sum);
	}

}
