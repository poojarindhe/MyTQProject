package com.weekendTest4;

public class MinChar
{
	public static void main(String[] args)
	{
		int b[]=new int[10];
		char a[]= {'a','P','z','z','a','P','z','P'};
		for(int i=0;i<a.length;i++)
		{ 
			int min=Integer.MAX_VALUE;
			
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
		        if(min>count)
	         	{
		        	min=count;
		            b[i]=(char)min;	
		         }
		
		      }
		
		
	        System.out.println("min frequency "+a[i]+" "+min);
		}
     }
}
  