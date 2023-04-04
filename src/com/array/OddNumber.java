package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args)
	{
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter array size");
		 * int size=sc.nextInt(); int []a= new int[size];
		 */
		
		int a[]= {1,5,3,4,4,6};
		System.out.println(" Elements are :"+Arrays.toString(a));
		
     //  System.out.println("Enter the elements :");
       for(int i=0;i<a.length;i++)
       {
    	  //  a[i]= sc.nextInt();
    	    if(a[i]%2!=0)
    	    {
    	    	System.out.println("odd num"+a[i]);
    	    }
			/*
			 * else if(a[i]%2==0) { System.out.println("even num"+a[i]); }
			 */
    	       
       }
       
	}

}
