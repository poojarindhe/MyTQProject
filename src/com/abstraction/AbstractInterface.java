package com.abstraction;

abstract class Abstractclass
{
	int num=20;
	
}
interface Myinterface1
{
	public static final int num1=10;
}
class Add extends Abstractclass implements Myinterface1
{
	public void sum() 
	{
		int sum=num+num1;
		System.out.println("Addition is "+sum);
	}
	
}

public class AbstractInterface 
{

	public static void main(String[] args) 
	{
      Add a=new Add();
      a.sum();
	}

}
