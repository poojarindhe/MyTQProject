package com.array;

import java.util.Arrays;

public class SortCharArray {
	
	  static void sortarray( char[] arr) 
	  { 
		  for(int i=0;i<arr.length-1;i++)
	  
	     {
	  
	        for(int j=i+1;j<arr.length-1;j++) 
	       { 
		         if(arr[i] >arr[j])
		           { 
			          char temp=arr[i];
	                       arr[i]=arr[j]; 
	                       arr[j]=temp; 
	                }
	         }
	     }
		  System.out.println("Sorted Arrays :"+Arrays.toString(arr));
		  
	  }
	public static void main(String[] args) 
	{
		char arr[] = {'Z','a','B','c','F','d'};
		System.out.println("Array Elements"+Arrays.toString(arr));
		/*
		 * for(int i = 0;i < arr.length-1 ; i++) {
		 * 
		 * for(int j = i+1 ; j < arr.length-1 ; j++) { if(arr[i] >arr[j]) { char
		 * temp=arr[i]; arr[i]=arr[j]; arr[j]=temp; } } }
		 */
		//System.out.println(Arrays.toString(arr));
		SortCharArray.sortarray(arr);
		//System.out.println(Arrays.toString(arr));
		}


}