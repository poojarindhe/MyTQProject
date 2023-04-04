package com.seven7Assignment;

import java.util.Scanner;

public class AverageQ10 {


	public static int average(int []array)
	{
		for(int res : array)
		  {
			  
			System.out.println(res);  
		  }

	  int sum=0;
	
	  for(int i=0;i<array.length;i++)
	  
	  {
		  sum= array[i]+sum;
	  }
	  System.out.println("sum is :"+sum);
	  System.out.println("Average is : "+(sum/array.length));
	  System.out.println("list of element is :");
	  
	  
	  	return sum;
	  
	}

	public static void main(String[] args) 
	{
		int []array= {1,3,2,5,7,3,9,1};
		
        AverageQ10.average(array);

	}

}

