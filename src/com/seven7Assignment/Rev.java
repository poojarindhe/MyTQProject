package com.seven7Assignment;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		int a[]=new int[5];
		int b[]=new int [5];
		System.out.println("Enter array");
		for(int i=0 ;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Rev Array");
		for(int i=a.length-1;i>=0;i--)
		{
			b[i]=a[i];
		
		System.out.println(b[i]);
		}
	}

}
