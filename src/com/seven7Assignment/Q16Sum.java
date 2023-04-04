package com.seven7Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q16Sum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter the array element:");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		
	   }
		
		System.out.println(" enter input");
		int n= sc.nextInt();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
			}
		
		if(sum==n)
		{
			System.out.println(a[i]);
		}
		}
	}

}
