package com.seven7Assignment;

import java.util.Scanner;

public class AveOfArray
{

	public static void average()
	{
	  int size;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size :");
	  size=sc.nextInt();
	  
	  int A[]=new int [size];
	  System.out.println("Enter the element: ");
	  
	  for(int i=0;i<size;i++)
	  {
		  A[i]=sc.nextInt();
	  }
	  int sum=0;
	  for(int i=0;i<size;i++)
	  
	  {
		  sum= A [i]+sum;
	  }
	  System.out.println("sum of array :"+sum);
	  System.out.println("Average is : "+(sum/size));
	  System.out.println("list of element is :");
	  
	  
	  for(int i=0;i<size;i++)
	  {
		  
		System.out.println(A[i]);  
	  }
	  
	}

	public static void main(String[] args) 
	{
		AveOfArray.average();
		

	}

}
