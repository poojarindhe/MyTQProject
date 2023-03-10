package com.logical;

import java.util.Scanner;

public class Reverse_no {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		int reverse=0;
		int r;
		while(num>0)
		{
			r=num%10;
			reverse=reverse*10+r;
			num=num/10;
		}
		System.out.println("Reverse no is : "+reverse);
	}

}
