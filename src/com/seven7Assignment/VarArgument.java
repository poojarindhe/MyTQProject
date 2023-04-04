package com.seven7Assignment;

public class VarArgument 
{
	public static void add(int...a)
	{
		for(int val : a)
		{
			System.out.print(val+" ");
		}
		System.out.println();

	}

	public static void main(String[] args) 
	{
		VarArgument.add(10);
		VarArgument.add(10,20);
		VarArgument.add(10,20,30);
		
		

	}

}
