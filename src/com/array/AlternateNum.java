package com.array;

import java.util.Arrays;

public class AlternateNum {

	public static void main(String[] args) 
	{
       
      int a1[]= {5,8,7,5,2};
      System.out.println("Arrays Elements are :"+Arrays.toString(a1));
      
      for(int i=0;i<a1.length;i=i+2)
      {
    	  System.out.println(a1[i]);
      }
     
	}

}
