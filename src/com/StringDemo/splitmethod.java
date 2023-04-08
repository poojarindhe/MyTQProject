package com.StringDemo;

public class splitmethod {

	public static void main(String[] args)
	{
//.$|()[{^?*+\\
		String s="Hello$World";
		String a[]=s.split("\\$");//special character used with back slash\\ 
		for(String arr : a)
		{
			System.out.println(arr);
		}
		
		

	}

}
