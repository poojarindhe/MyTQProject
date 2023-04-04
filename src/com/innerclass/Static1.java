package com.innerclass;

public class Static1 
{
	static int x=10;
	static int y=20;
	
	static class static2
	{
		void show()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}

	public static void main(String[] args)
	{
		Static1.static2 ss= new Static1.static2();
		ss.show();

	}

}
