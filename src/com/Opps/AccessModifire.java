package com.Opps;

public class AccessModifire
    {
	private int a=9;
	public int b=10;
	protected int c =45;
	
	private void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	void msg()//default
	{
		System.out.println("Hello");
	}
	protected void msg1()
	{
		System.out.println("Hello.....");
	}  
	public static void main(String[] args) 
	{
		AccessModifire ac=new AccessModifire();
	    System.out.println(ac.a);
	    System.out.println(ac.b);
	    System.out.println(ac.c);
	    ac.m1(); 
	    ac.m2();
	    ac.msg();
	    ac.msg1();
	    
	    
	}

}
