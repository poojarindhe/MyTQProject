package com.seven7Assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array :");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        }
        
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]%2==0 && a[i]>0)
        	 {
        		 System.out.println("Even"+a[i]);
        	 }
        	 else if(a[i]%2!=0 && a[i]>0)
        	 {
        		 System.out.println("Odd"+a[i]);
        	 }
         
         
         
        	 if(a[i]>0)
        	 {
        		 System.out.println("Positive"+a[i]);
        	 }
        	 else if(a[i]<0)
        	 {
        		 System.out.println("Negative"+a[i]);
        	 }
        	 else
        	 {
        		 System.out.println("Number 0");
        	 }
         }
	}

}
