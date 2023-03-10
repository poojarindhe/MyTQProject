package com.logical;

import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num :");
		int num=sc.nextInt();
		
		int rev=0;
		while(num>0)
		{
			int r=num%2;
			num=num/2;
			System.out.print(r);
		}
		
	}

}
