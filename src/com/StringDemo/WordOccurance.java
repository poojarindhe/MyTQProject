package com.StringDemo;

import java.util.Scanner;

public class WordOccurance 
{
	public static void occurance(String str)
	{
		String s[]=str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(s[i].equals(s[k]))
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited == false)
			{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					count++;
				}
			}
			System.out.println(s[i]+" "+count);
			}
		}
	}

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string :");
		
		String str=sc.nextLine();
		
		occurance(str);
		
		

	}

}
