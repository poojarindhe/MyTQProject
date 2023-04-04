package com.array;

public class MinMaxarray
{
	public static void colMax(int a[][])
	{
		for(int x[]:a)
		{
			for(int n : x)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int max= a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]>max)
				{
					max=a[j][i];
				}
				
			}
			System.out.println("Maxcol :"+max);
		}
		System.out.println(".................... ");
	}
	public static void colMin(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min= a[0][i];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[j][i]<min)
				{
					min=a[j][i];
				}
				
			}
			System.out.println("Mincol :"+min);
		}
		System.out.println(".....................");
	}
	
	public static void rowsMin(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int min= a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
				
			}
			System.out.println("MinRows :"+min);
		}
		System.out.println(".........................");
	}
	
	public static void rowsMax(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int max= a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
				
			}
			System.out.println("MaxRows :"+max);
		}
	}

	public static void main(String[] args)
	{
        int a[][]= {{2,3,6,1},
        		    {1,8,9,3},
        		    {5,9,1,3},
        		    {7,2,6,3}};
        
        MinMaxarray.colMax(a);
        MinMaxarray.colMin(a);
        MinMaxarray.rowsMin(a);
        MinMaxarray.rowsMax(a);
	}

}
