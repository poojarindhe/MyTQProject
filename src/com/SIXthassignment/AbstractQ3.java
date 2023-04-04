package com.SIXthassignment;

abstract class Laptop
{
	abstract void memory();
}
abstract class Dell extends Laptop
{
	abstract void opratingSystem();
}
class Details 
{
	void memory()
	{
		System.out.println(" Ram 8GB");
	}
	void operatingSystem()
	{
		System.out.println(" windows 10");
		
	}
	
}

public class AbstractQ3
{

	public static void main(String[] args)
	{
       Details d=new Details();
       d.memory();d.operatingSystem();
	}

}

