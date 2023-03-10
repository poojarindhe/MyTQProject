package com.checkcondition;

import java.util.Scanner;

public class CheckNumDivisible {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		if(num%3==0 && num%9==0)
		{
			System.out.println("Number is divisible by 3 and 9");
		}
		else {
			System.out.println("Number is not divisible by 3 and 9");
		}
	}

}
