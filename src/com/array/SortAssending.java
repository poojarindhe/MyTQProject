package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortAssending {
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("enter Array size :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);

	}

}
