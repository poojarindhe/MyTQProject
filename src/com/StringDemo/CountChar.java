package com.StringDemo;

public class CountChar {

	public static void main(String[] args)
	{
		int count=0;
		String str="Hello java";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
				
			}
			
		}
		System.out.println("Total number of char is "+count);

	}

}
