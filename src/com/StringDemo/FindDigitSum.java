package com.StringDemo;

import java.util.Scanner;

public class FindDigitSum
{
	public static void digitsum(String str)
	{
		int sum=0;
		for(int i=0 ;i<str.length(); i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int x=Character.getNumericValue(str.charAt(i));
				sum=sum+x;
			}
			
		}
		System.out.println("sum og digit is "+sum);
		
	}
	public static void sumofdigit(String str)
	{
		int sum=0;
		
		for(int i=0 ;i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				sum=sum+Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		digitsum(str);
		sumofdigit(str);

	}

}
