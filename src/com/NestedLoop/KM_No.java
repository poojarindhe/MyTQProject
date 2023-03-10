package com.NestedLoop;

import java.util.Scanner;

public class KM_No {

	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter any num");
		int n=s.nextInt();
		int sum=0;
		int temp=n;
		for(int i=1;i<=n;)
		{
			int digit=n%10;
			int fact=1;
			for(int j=1;j<=digit;j++)
			{
				fact=fact*j;
			}
			sum=sum+fact;
		n=n/10;
		    
		}
        n=temp;
        if(sum==n)
         {
        	System.out.println("num is KM");
        }
        else
        {
        	System.out.println("no is not KM");
        }
	}

}
