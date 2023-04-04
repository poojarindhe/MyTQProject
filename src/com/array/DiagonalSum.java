package com.array;

public class DiagonalSum {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},
				    {4,6,3},
				    {6,9,8}};
		int sum=0;
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(i==j)
                {
	               sum=sum+a[i][j];
                }
			}
		}
		System.out.println(sum);
	

	}

}
