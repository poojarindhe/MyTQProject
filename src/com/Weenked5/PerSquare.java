package com.Weenked5;

public class PerSquare
{
	
	public static void main(String[] args)
	{
	   
	    int arr[] = { 23,43,25,49,12,9,78,66,39};
	    for(int i=0;i<arr.length;i++)
	    {
	    	int num=arr[i];
	    	int j=1;
	    	while(num>0)
	    	{
	    		num=num-j;
	    		j=j+2;
	    	}
	    	if(num==0)
	    	{
	    		System.out.println(arr[i]);
	    	}
	    			
	    	
	    }
	 
	   
	   
	}
	}



