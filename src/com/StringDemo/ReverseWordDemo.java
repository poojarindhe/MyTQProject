package com.StringDemo;

import java.util.Scanner;

public class ReverseWordDemo
{
	public static void reverseword(String str)
	{
		String []s=str.split(" ");
		String middleword="";
		for(int i=1;i<s.length-1;i++)
		{
			String word=s[i];
			String myrevword = "";

			for(int j=word.length()-1 ; j>=0 ; j--)
			{
				myrevword = myrevword + word.charAt(j);
			}
			middleword=middleword + myrevword + " ";
		}
		System.out.println(s[0]+" "+middleword+" "+s[s.length-1]);
		
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str= sc.nextLine();
		ReverseWordDemo.reverseword(str);

	}

}
