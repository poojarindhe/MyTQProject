package com.weekendTest4;

import java.util.Arrays;

public class EvenOddNumber1
{
	public static void main(String[] args)
	{

	
		
		  int a[]= {1,5,3,4,4,6};
		  System.out.println(" Elements are :"+Arrays.toString(a));
		  
		  int Ecount=0;
		  int Ocount=0;
		  for(int i=0;i<a.length;i++)
		  {
			 
		  
		  if(a[i]%2!=0) 
		  { 
			   Ocount++;
		  }
		  
		  else if(a[i]%2==0)
		        {
		         
		         Ecount++;
		        } 
		  }
		  System.out.println("Odd number :"+Ocount); 
		  System.out.println("Even number :"+Ecount); 
		  
		  
	}
}