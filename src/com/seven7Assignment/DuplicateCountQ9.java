package com.seven7Assignment;

import java.util.Scanner;

public class DuplicateCountQ9 {

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
	
	int count=0;
	for(int i=0;i<size;i++)
	{
		for(int j=i+1;j<size;j++)
		{
		   if(a[i]==a[j])
		   {
			count++;
		    }
		}	
		
	}
	System.out.println("duplicate count is "+count);

}
}