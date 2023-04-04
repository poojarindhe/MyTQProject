package com.array;

import java.util.Scanner;

public class SumOf2DArray {

	public static void main(String[] args)
	{
		
		 int columns =4;
		 int rows= 2;
		
		int[][] a = {{1,3,2,5},{6,2,4,6}};
		int[][] b = {{2,3,5,6},{1,6,2,8}};
 
		int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // Displaying the sum 
        System.out.println("Sum of the given matrices is: ");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
		
		
	}

}
