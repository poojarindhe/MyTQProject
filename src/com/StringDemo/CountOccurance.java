package com.StringDemo;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				
				count++;
			}
		}
		System.out.println(" The character " +ch+ " is appeares " +count+ " times");
		
		

	}

}
