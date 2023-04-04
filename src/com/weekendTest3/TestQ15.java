package com.weekendTest3;
class Person
{
	int number;
}

public class TestQ15 
{
	public void doThis(int i ,Person p)
	{
		i=5;
		p.number=8;
	}

	public static void main(String[] args) 
	{
		int x=0;
		Person p = new Person();//create class Person
		new TestQ15().doThis(x,p);
		System.out.println(x+" "+p.number);
	}

}
