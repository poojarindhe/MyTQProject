package com.array;

import java.util.Arrays;

public class MinNum {

	public static void main(String[] args) 
	{
       int aa[]= {4,1,9,35,66,2};
       System.out.println("Arrays Elements are :"+Arrays.toString(aa));
       int min=aa[0];
       for(int i=0;i<aa.length;i++)
       {
    	 if(aa[i]<min)
    	 {
    		 min=aa[i];
    	 }
       }
       System.out.println("Min value is "+min);
	}

}
