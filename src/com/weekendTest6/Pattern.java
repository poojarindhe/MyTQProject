package com.weekendTest6;

public class Pattern 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j>=i)
				{
					System.out.print("*");
				}
			}
			System.out.println("");
		}


	}


}
