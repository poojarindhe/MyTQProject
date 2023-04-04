package com.seven7Assignment;

import java.util.Scanner;

public class Q16
{
		void pair()
	{
	int size;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the array size:");
	size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("enter the array element:");
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(a[i]==a[j])
			{
				a[j]=0;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size;j++)
		{
			if(a[j]!=0 && a[i]!=0 )
			{
				System.out.println("{"+a[i]+","+a[j]+"}");
			}
		}
	}
	sc.close();
	}
	public static void main(String[] args)
	{

		Q16 p=new Q16();
		p.pair();

	}

}
