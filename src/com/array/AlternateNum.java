package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateNum {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter array :");
		int a1[]= new int[size];
		int b[]=new int[20];
		
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
       
     // int a1[]= {11,13,15,17,19,12,14,16,18,20};
      System.out.println("Arrays Elements are :"+Arrays.toString(a1));
     
      
      for(int i=0;i<a1.length/2;i++)
      {
    	  
    	  if(a1[i]%2!=0)
    	  {
    	  b[i]=a1[i]+1;
    	  
    	  }
    	  else
    	  {
    		  a1[i]=a1[i]-1;
    	  }
      
      System.out.println(b[i]);
      System.out.println(a1[i]);
    	 
      } 
      
	}

}
