package com.forth;

public class NumChar 
{
	public void print(int n ,char c)
	{
		System.out.println(n+" "+c);
	}
	public void print(char c,int n)
	{
		System.out.println(c+" "+n);
	}

	public static void main(String[] args)
	{
		NumChar obj=new NumChar();
		obj.print(5, 'A');
		obj.print('A', 5);

	}

}
