package com.third;

public class Opration 
{
	public void Add(int a,int b)
	{
		System.out.println("Addition is "+(a+b) );
	}
	public void Sub(int a,int b )
	{
		System.out.println("Substraction is "+(a-b));
	}
	public void Mul(int a,int b)
	{
		System.out.println("Multiplication is "+(a*b));
	}
	public void div(int a,int b)
	{
		System.out.println("division is "+(a/b));
	}
	

	public static void main(String[] args)
	{
        Opration o=new Opration();
        o.Add(12, 12);
        o.Sub(35, 10);
        o.Mul(2, 5);
        o.div(9, 3);
	}

}
