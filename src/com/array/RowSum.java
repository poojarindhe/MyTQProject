package com.array;

import com.Opps.A;

public class RowSum {
	
	public static void eachrowSum(int a[][])
	{
		for(int[] value : a)
		{
			for(int n:value)
			{
			System.out.print(n+" ");
		    }
			System.out.println();
		}
		
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("SumofRows :"+sum);
		}
	}
	public static void eachcolSum(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int sumcol=0;
			for(int j=0;j<a[i].length;j++)
			{
				sumcol=sumcol+a[j][i];
			}
			System.out.println("sumOfcol "+sumcol);
		}
	}

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},{4,5,6},{6,7,3}};
		RowSum.eachrowSum(a);
		RowSum.eachcolSum(a);

	}

}
