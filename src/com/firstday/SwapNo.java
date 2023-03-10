package com.firstday;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) 
	{
		int a,b,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 
		 System.out.println("Before swapping numbers are :"+a+" "+b);
		 temp=a;
	     a=b;
	     b=temp;
	     System.out.println("After swapping numbers are :"+a+" "+b);	
	}

}
