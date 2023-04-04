package com.array;

import java.util.Scanner;

public class ArraySqPattern {

	public static void main(String[] args)
	{
		int a[][]=new int[4][4];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array :");
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a[i].length;j++)
    	   {
    		   a[i][j]=sc.nextInt();
    	   }
       }
       System.out.println(".............");
       for(int val[] :a)
       {
    	   for(int n : val)
    	   {
    		   System.out.print(n+" ");
    	   }
    	   System.out.println();
       }
       System.out.println("...............");
       
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a.length;j++)
    	   {
    		   if(i==0 || j==0 || i==a.length-1 || j==a.length-1)
    		   {
    			   System.out.print(a[i][j]+" ");
    		   }
    		   else
    		   {
    			   System.out.print("  ");
    		   }
    		   
    	   }
    	   System.out.println();
       }
	}

}
