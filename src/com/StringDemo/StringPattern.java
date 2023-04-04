package com.StringDemo;

public class StringPattern
{
	public static void pattern(String s)
	{
		String str[]=s.split(" ");
		 
		 for(int i=0;i<str.length;i++)
		 {
			 for(int j=0;j<=i;j++)
			 {
				 System.out.print(str[j]+" ");
			 }
			 System.out.println();
		 }
		
	}

	public static void main(String[] args)
	{
		
		 String s= "I like india Country";
		 
		  StringPattern.pattern(s);
    }

}
