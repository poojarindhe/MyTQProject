package com.array;

public class TransposeMatrix
{
	 public static void display(int[][] a) {
	        System.out.println("The matrix is: ");
	        for(int[] row : a)
	        {
	            for (int column : row)
	            {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	    }
	 public static void transpose(int[][]a)
	 {
	 int[][] transpose = new int[3][2];
     for(int i = 0; i < 2; i++)
     {
         for (int j = 0; j < 3; j++) 
         {
             transpose[j][i] = a[i][j];
         }
     }
	 }

	public static void main(String[] args) 
	{
		//int a[][]= new int[2][3];
		 int[][]a = { {2, 3, 4}, {5, 6, 4} };

		display(a);
		transpose(a); 

	}

}
