package com.logical;

import java.util.Scanner;

public class Check_PrimeNo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=sc.nextInt();
		
		int i=2;
		boolean isprime=true;
		
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime==true) 
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Is not Prime number");
		}
	

	}

}
