package com.array;

public class EvenPostionNum {

	public static void main(String[] args)
	{
       int a[]= {9,3,4,1,5,7};
       
       System.out.println("Elements of given array is present on even position");
       
       for(int i=0;i<a.length;i=i+2)
       {
    	   System.out.println(a[i]);
       }
	}

}
