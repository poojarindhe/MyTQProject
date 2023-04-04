package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Atenatenum {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size= sc.nextInt();
		System.out.println("enter array elements");
		int a[]= new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
 
	}

}
