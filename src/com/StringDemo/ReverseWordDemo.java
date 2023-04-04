package com.StringDemo;

import java.util.Scanner;

public class ReverseWordDemo
{
	public static void reverseword(String str)
	{
		String []s=str.split(" ");
		String revstr="";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String myrevword = "";

			for(int j=word.length()-1 ; j>=0 ; j--)
			{
				myrevword = myrevword + word.charAt(j);
			}
			revstr=revstr + myrevword + " ";
		}
		System.out.println(revstr);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str= sc.nextLine();
		ReverseWordDemo.reverseword(str);

	}

}
