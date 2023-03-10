package com.logical;

import java.util.Scanner;

public class EvenDigit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int evendigit=0;
		int i=1; 
		
		
		while(num>i)
		{
		 int r=num%10;
		if(r%2==0)
		{
			System.out.println("Even no"+r);
			
		}
		num=num/10;
		}
		

	}

}
