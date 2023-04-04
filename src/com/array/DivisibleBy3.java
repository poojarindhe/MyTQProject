package com.array;

import java.util.Scanner;

public class DivisibleBy3
{
	public static void divisible(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0)
			{
				arr[i]=0;
			}
			System.out.println(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		/*
		 * int a[]= {2,5,3,9,6,2,1,9};
		 * 
		 * for(int i=0;i<a.length;i++) { if(a[i]%3==0) { a[i]=0; }
		 * System.out.print(a[i]+" "); }
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array :");
		int arr[]=new int[6];
	
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		DivisibleBy3.divisible(arr);
	
	}

}
