package com.mypractice;

public class Test1 {

	public static void main(String[] args) 
	{
		outer:
		for(int i=1;i<=4;i++)
		{   inner:
			for(int j=1;j<=4;j++)
			{
				if(j==1)
					break outer;
			}
		System.out.println("A");
		}
	}

}
