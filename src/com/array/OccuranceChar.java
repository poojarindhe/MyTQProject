package com.array;

import java.util.Arrays;

public class OccuranceChar
{
	public static void main(String[] args)
	{
		char a[]= {'a','P','z','L','a','P'};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{ 
			int count =1;
			boolean isvisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(a[i]==a[k])
				{
					isvisited=true;
					break;
				}
			}
			if(isvisited==false)
			{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
					 
		}
		System.out.println(a[i]+" "+count);
		}
		}
	}

}
