package com.checkcondition;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		char ch = sc.next().charAt(0);
		
		if(ch>='0' && ch<='9')
		{
			System.out.println(ch+ " is digit");
		}
		else 
		{
			System.out.println(ch+ " is a alphabet");
		}
		
	}
}
