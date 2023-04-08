package com.StringDemo;

import java.util.Scanner;

public class Reversestring 
{
	public static void reverse(String s)
	{
		 String rev=" ";
		    
		    for(int i=s.length()-1;i>=0;i--)
		    {
		    	rev=rev+s.charAt(i);
		    }
			
	       System.out.println(" original String :"+s);
	       System.out.println(" Reverse String :"+rev);
		
	}
	public static String ReveString(String s)
	{
		String str=" ";
		for(int i=0; i<s.length(); i++)
		{
			str=s.charAt(i)+str;
		}
		System.out.println(str);
		return str;
		
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String :");
	    String s=sc.next();
	    reverse(s);
	    System.out.println("................");
	    ReveString(s);
	    
	    System.out.println(".................");
	    //convert chararray to String
	    char ch[] = {'h','e','l','l','o'};
		String s1 = new String(ch);
		System.out.println(s1);
	   
	}

}
