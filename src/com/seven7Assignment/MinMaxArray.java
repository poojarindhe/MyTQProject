package com.seven7Assignment;

import java.util.Scanner;

public class MinMaxArray {

	public static void main(String[] args) 
	{
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int arr[]=new int [5];
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
		
		}
		System.out.println(min+" "+max);
	}

}
