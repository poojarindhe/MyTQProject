package com.checkcondition;

import java.util.Scanner;

public class TernaryOpDemo2 {

	public static void main(String[] args)
	{
		//to check greatest number in between three number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first no ");
		int a = sc.nextInt();
		System.out.println("Enter the second no");
		int b =sc.nextInt();
		System.out.println("Enter the third no");
		int c = sc.nextInt();
		
		  int max = (a>b)?(a>c?a:c):(b>c?b:c);
		  System.out.println(max + "is greater number");
		
	}

}
