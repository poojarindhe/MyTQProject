package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortChar 
{
	public static void charsort(char a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));   
		
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array size :");
		int size =sc.nextInt();
		System.out.println("Enter array :");
		char a[]= new char[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(a));
         charsort(a);
	}

}
