package com.weekendTest4;

import java.util.Arrays;

import com.array.ShiftElements0;

public class ShiftZeroQ6
{
	public static void shiftelements(int a[])
	{
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[k]=a[i];
				k++;
			}
			
		}
		while(k<a.length)
		{ 
			a[k]=0;
			k++;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args)
	{
		int a[]= {0,6,0,2,0,3,5};
		System.out.println(Arrays.toString(a));
		ShiftZeroQ6.shiftelements(a);

	}


}
