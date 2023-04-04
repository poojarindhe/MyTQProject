package com.seven7Assignment;

public class Q15 {

	public static void main(String[] args) 
	{
		int a[]= {72,69,76,76,79};
		for(int val : a)
		{
			System.out.print(val+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%10==9)
			{
				a[i]=0;
			}
		
		System.out.print(a[i]+" ");
		}
	}

}
