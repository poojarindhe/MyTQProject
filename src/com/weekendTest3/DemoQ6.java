package com.weekendTest3;

public class DemoQ6 
{
	int x=10;
	public void assign (int x)
	{
		x=x;
		System.out.println(this.x);
	}

	public static void main(String[] args)
	{
       new DemoQ6().assign(100);
	}

}
