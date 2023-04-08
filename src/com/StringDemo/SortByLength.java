package com.StringDemo;

import java.util.Arrays;
import java.util.Scanner;

public class SortByLength 
{
	public static void sort(String str)
	{
		String s[]=str.split(" ");
		
		for(int i=0 ; i<s.length ; i++)
		{
			for(int j=i+1 ; j<s.length ; j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
				else if(s[i].length()==s[j].length())
				{
					if(s[i].compareTo(s[j])<0)
					{
					String tem=s[i];
					s[i]=s[j];
					s[j]=tem;
					}
				}
			}
		}
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		
		sort(str);
		
		
		
	}

}
