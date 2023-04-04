package com.seven7Assignment;

import java.util.Scanner;

public class SumProductQ6 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array");
		//int n=sc.nextInt();
		
       
       int sum=0;
       int product=1;
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=sc.nextInt();
    	  sum=sum+arr[i]; 
    	  product=product*arr[i];
       }
       System.out.println("Sum of elements"+sum);
       System.out.println("Product of elements :"+product);

	}

}
