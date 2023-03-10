package com.second;

import java.util.Scanner;

public class Max_no {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no");
		int a=sc.nextInt();
		System.out.println("Enter second no");
		int b=sc.nextInt();
		System.out.println("Enter third no");
		int c=sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greater no");
		}
		else if(a>c)
		{
			System.out.println(a+" is greater no");
		}
		else if(b>c){
			System.out.println(b+" is greater no");
		}
		
		else {
			System.out.println(c+" is greater no");
		}
		
	}

}
