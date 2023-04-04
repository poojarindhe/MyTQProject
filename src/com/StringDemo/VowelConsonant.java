package com.StringDemo;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		
		System.out.println(s.toLowerCase());
		int vcount=0;
		int cCount=0;
		
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			vcount++;
		}
		else if(s.charAt(i)>='a'||s.charAt(i)<='z')
		{
			cCount++;
		}
	   }
		System.out.println("Numbers of Vowels is :"+vcount);
		System.out.println("Numbers of Consonants is :"+cCount);

	}

}
