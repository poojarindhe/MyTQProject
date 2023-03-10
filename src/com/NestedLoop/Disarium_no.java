package com.NestedLoop;

import java.util.Scanner;

public class Disarium_no {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter num :");
		int n=sc.nextInt();
		int copy=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);
		
		n=copy;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int power=1;
		for(int i=1;i<=count;i++)
		{
			power=power*r;
		}
		sum=sum+power;
		count--;
		n=n/10;
		}
      System.out.println(sum);
      if(sum==n)
      {
    	  System.out.println("num is disarium");
      }
      else
      {
    	  System.out.println("not disarium");
      }
	}

}
