package com.logical;

public class Break_ContinueDemo1 {

	public static void main(String[] args)
	{
		for(int i=1;i<=20;i++)
		{
			if(i%3==0||i%9==0)
			{
				break;
			}
			System.out.println(i);
		}
		

	}

}
