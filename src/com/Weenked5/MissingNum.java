package com.Weenked5;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum 
{
		
		
		public static void main(String[] args) {

			   int num;
			   int[] a = new int[]{1,2,3,4,6,7};
			   num= 7;
			   int total_sum= num * ((num + 1) / 2);
			   int sum = 0;
			   for (int i: a)
			   {
			    sum =sum+ i;
			   }
			   System.out.println(total_sum );
			   System.out.println(sum);
			       System.out.print( total_sum - sum);
				   System.out.print("\n");
			  }
	 }
		

	


