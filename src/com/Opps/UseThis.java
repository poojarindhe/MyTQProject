package com.Opps;

public class UseThis {
	int id;
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
		UseThis us=new UseThis();
		us.input(11);
		us.display();
		us.m2();
	}

}
