package com.StringDemo;

public class StringComparisionDemo 
{
	
	public static void campare(String s1,String s2)
	{
		boolean isSame=s1.equals(s2);
		System.out.println(isSame);
		
		boolean issame=s1.equalsIgnoreCase(s2);
		System.out.println(issame);
		
		int i=s1.compareTo(s2);
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="HEllo";
		
		campare(s1,s2); 	
	}

}
