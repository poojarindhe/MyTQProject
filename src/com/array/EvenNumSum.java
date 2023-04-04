package com.array;

import java.util.Scanner;

public  class EvenNumSum 
{
	
	public static void evenSum(int a[])
	{    
	int sum=0;
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				 sum=sum+a[i];
			}
			
		}
		System.out.println("Sum of Even Array is :"+sum);
			
	}
public static void main(String[] args) 
 {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter array size :");
	int size= sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter elements");
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
		
	}
	EvenNumSum.evenSum(a);
	
	

 }

}
