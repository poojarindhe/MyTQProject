package com.StringDemo;

import java.util.Scanner;

public class AvgofDigit 
{

	public static void Avgofdigit(String str)
	{
		int sum=0;
		int count=0;
		int Avg=0;
		
		
		for(int i=0 ;i<str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			    sum=sum+Character.getNumericValue(str.charAt(i));
				
			}
			
		}
		System.out.println("Average is :"+(sum/count));
	}

	public static void main(String[] args) 
	{
Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the string");
		String str=sc.nextLine();
		Avgofdigit(str);


	}

}
