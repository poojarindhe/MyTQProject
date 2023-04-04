package com.forth;

import com.Opps.UseThis;

public class UseThisKeyword {
	int id;
	
	UseThisKeyword()
	{
		System.out.println("I am defualt constructor.....");
	}
	UseThisKeyword(int id)
	{
		this();
		System.out.println("I am Parameterized constructor....");
		
	}
	public void input(int id)
	{
		this.id=id;
	}
	public void display()
	{
		System.out.println(id);
	}
	
	public void m1()
	{
		System.out.println("Method m1");
	}
	public void m2()
	{
		System.out.println("Method m2");
		this.m1();
		System.out.println("Hello java....");
	}


	public static void main(String[] args)
	{
		
		UseThisKeyword us=new UseThisKeyword();
		UseThisKeyword t=new UseThisKeyword(12);
		
		us.input(11);
		us.display();
		us.m2();
	}

	

}
