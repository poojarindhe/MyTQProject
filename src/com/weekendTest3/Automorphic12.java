package com.weekendTest3;

import java.util.Scanner;

public class Automorphic12 
{
	public static void main(String[] args)
	{
				Scanner s=new Scanner(System.in); 
				System.out.println("Enter the num :");
				int n=s.nextInt();
				System.out.println(" Automorphic number between 1 and "+n+" are :");
				
				for(int i=1;i<=n;i++)
				{
		        int sq = i*i;
		        int num=i;
		        boolean isAutomorphic=true;

		        while(num>0)
		        {
		            if(num%10!=sq%10)
		            {
		                isAutomorphic =false;
		                break; 
		            }

		            num = num/10;

		            sq = sq/10;
		        }

		        if(isAutomorphic)
		        {
		            System.out.print(i+" ");
		        }
		        
		}
	}
			
}
		 
	


