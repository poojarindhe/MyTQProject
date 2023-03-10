package com.logical;

import java.util.Scanner;

public class Extract_digit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		  int m,counter=0;
		  m=n;
		  while(m>0)
		  {
			  m=n%10;
			  System.out.println("Digits is at position :"+counter);
			  m=n/10;
			  counter--;
		  }
		

	}

}
