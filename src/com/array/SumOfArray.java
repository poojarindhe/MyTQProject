package com.array;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array");
		//int n=sc.nextInt();
		
       
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=sc.nextInt();
    	  sum=sum+arr[i]; 
       }
       System.out.println("Sum of elements"+sum);
	}

}
