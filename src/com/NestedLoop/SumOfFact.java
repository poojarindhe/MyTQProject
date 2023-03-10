package com.NestedLoop;

import java.util.Scanner;

public class SumOfFact {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num ");
		//System.out.println("Entr start");
		int n=sc.nextInt();
	//   System.out.println("Enter end");
		//int end=sc.nextInt();
		
		int sum=0;
		int i=1;
		
		while(i<=n)
		{
			int fact=1;
			int j=1;
			while(j<=i)
			{
				fact=fact*j;
				j++;
			}
			sum=sum+fact;
			i++;
		}
		System.out.println("sum is :"+sum);

	} 

}
