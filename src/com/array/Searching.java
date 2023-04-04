package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Searching {

	public static void main(String[] args)
	{
		int a[]= {2,6,4,3,9,1};
		System.out.println(Arrays.toString(a));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num ");
		int num = sc.nextInt();
		
		boolean ispresent=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				ispresent=true;
			}
			
		}
		if(ispresent)
		{
			System.out.println("num is present");
		}
		else
		{
			System.out.println("Not present");
		}

	}

}
