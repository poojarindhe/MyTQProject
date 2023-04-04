package com.weekendTest4;

public class MaxRowQ12 {
	public static void rowsMax(int a[][])
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
        int a[][]= {{22,31,9},
        		    {12,25,16}};
        
        MaxRowQ12.rowsMax(a);
	}

}
