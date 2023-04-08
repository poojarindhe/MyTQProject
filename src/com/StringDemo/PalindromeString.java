package com.StringDemo;

import java.util.Scanner;

public class PalindromeString 
{
	public static void palindrome(String str)
	{
		String s=str.toLowerCase();
	    String rev="";
    
    for(int i=s.length()-1;i>=0;i--)
    {
    	rev=rev+s.charAt(i);
    
    }
   System.out.println(s);
   System.out.println(rev);
   if(s.equals(rev))
   {
	   System.out.println("palindrome");
   }
   else
   {
	   System.out.println("not palindrome");
   }
    
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		
		palindrome(str);

	}

}
