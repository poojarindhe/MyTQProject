package com.seven7Assignment;

import java.util.Arrays;

public class Q11 {


	public static void shiftneg(int a[]) 
	{

	int j=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<=0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j++;
		}
		
	}
	
	System.out.println(Arrays.toString(a));
  }

	public static void main(String[] args)
	{
		int a[]= {1,3,-1,7,-5,0};
		System.out.println(Arrays.toString(a));
          Q11.shiftneg(a);
	}

}

