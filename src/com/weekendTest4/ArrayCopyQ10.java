package com.weekendTest4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCopyQ10 
{
	public static void main(String[] args) {
		
	
	int[][] Arr = { {1, 2, 3, 4}, {5, 6, 7, 8} };
	System.out.println(Arrays.deepToString(Arr));
	int[][] ArrCopy = new int[Arr.length][Arr[0].length];

	for (int i = 0; i < Arr.length; i++) {
	    int start = 0;
	    int end = Arr[i].length - 1;
	    while (start <= end) 
	    {
	        ArrCopy[i][start] = Arr[i][end];
	        ArrCopy[i][end] = Arr[i][start]; 
	        start++;
	        end--;
	    }
	}

	System.out.println(Arrays.deepToString(ArrCopy));

}

}

