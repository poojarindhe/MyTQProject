package com.seven7Assignment;

import java.util.Scanner;

public class PrintQ3 {

	
		public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the specific element");
		int no=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(a[i]==no)
			{
				System.out.println("element is Present");
			}
			else
			{
				System.out.println("Not Present");
			}
		
		}
		
    
	}

}
