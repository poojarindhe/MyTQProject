package com.array;

import java.util.Arrays;

public class Merge {
	
		public static void main(String[] args)
		{
			int []a1= {1,2,3,5};
			System.out.println("First array :"+Arrays.toString(a1));
			int []a2= {6,3,5,9,7};
			System.out.println("Second array :"+Arrays.toString(a2));
			int merge[]=new int[a1.length+a2.length];
			
			for(int i=0;i<a1.length;i++)
			{
				merge[i]=a1[i];
			}
			for(int i=0;i<a2.length;i++)
			{
				merge[a1.length+i]=a2[i];
			}
			for(int i=0;i<merge.length;i++)
			{
				
			}
			System.out.println("Merge array :"+Arrays.toString(merge));
	}

}
