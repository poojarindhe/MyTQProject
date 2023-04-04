package com.array;

import java.util.Scanner;

public class MergeArray {
	
	int a[]=new int[10];
	int b[]=new int[10];
	int c[]=new int[20];
	int m,n;
	
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first array :");
		int m=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the second array :");
		int n=sc.nextInt();
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		
	}
	void merge()
	{
		int i,j;
		for(i=0;i<m;i++)
		
			c[i]=a[i];
			j=i;
			for(i=0;i<n;i++,j++)
				c[j]=b[i];
			System.out.println("The merge array :");
			for(i=0;i<m+n;i++)
			
				System.out.print(c[i]+" ");
   }        

	public static void main(String[] args)
	{
		MergeArray vv= new MergeArray();
	    vv.accept();
		vv.merge();
 	}

}
