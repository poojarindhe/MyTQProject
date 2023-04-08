package com.ExceptionHandle;

public class HandleDemo {

	public static void main(String[] args) 
	{
		System.out.println("Hello....");
		
		try
		{
		int x=10;
		int ans=x/0;
		System.out.println(ans);
		
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		  
		
		System.out.println("Hello java...");
		System.out.println(4*10);
		

	}

}
