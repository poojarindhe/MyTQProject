package com.StringDemo;

public class CountWord 
{

	public static void main(String[] args) 
	{
	
				int count=1;
				String str="Hello java";
				
				for(int i=0;i<str.length();i++)
				{
					if(str.charAt(i)==' ')
					{
						count++;
						
					}
					
				}
				System.out.println("Total number of word is "+count);

			}

		


}


