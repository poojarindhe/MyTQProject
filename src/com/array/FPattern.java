package com.array;

public class FPattern {

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3},
			        {4,6,3},
			       {6,9,8}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j==0 || i+j==1 || i+j==2 || i!=2)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
