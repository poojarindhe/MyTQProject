package com.seven7Assignment;

import java.util.Scanner;

public class ReverseArray 
{
    void reverse()
    {
	int size;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	size=sc.nextInt();
	
	int a[]=new int[size];
	
	System.out.println("enter elements :");
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0;i<size/2;i++)
	{
		int temp=a[i];
		a[i]=a[size-i-1];
		a[size-i-1]=temp;
	}
	for(int i=0;i<size;i++)
	{
		System.out.println(a[i]);
	}
	sc.close();
}

public static void main(String[] args)
{
	ReverseArray r = new ReverseArray();
	r.reverse();
	
	
}
}