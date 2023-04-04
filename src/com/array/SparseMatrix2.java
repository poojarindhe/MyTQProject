package com.array;

import java.util.Arrays;

public class SparseMatrix2 {

	public static void main(String[] args)
	{
      int size,count=0;
      int a[][]= {{1,0,3},
    		      {0,2,0},
    		      {0,1,0},
    		      {0,4,0}};
      for(int[]val : a)
      {
    	  for(int n : val)
    	  {
    		  System.out.print(n+" ");
    	  }
    	  System.out.println();
      }
      
      
       int rows=a.length;
       int cols=a[0].length;
       
       size=rows*cols;
       
       for(int i=0;i<rows;i++)
       {
    	   for(int j=0;j<cols;j++)
    	   {
    		  if(a[i][j]==0)
    		  {
    			  count++;
    		  }
    	   }
      }
       if(count>(size/2))
       {
    	   System.out.println("Given Matrix is SparseMatrix");
    	   
   	   }
       else
       {
    	   System.out.println("not SparseMatrix");
       }
	}

}
