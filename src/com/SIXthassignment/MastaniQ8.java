package com.SIXthassignment;

interface IceCream
{
	abstract void eat();
}
interface Juice
{
	abstract void drink();
}
public class MastaniQ8 implements IceCream,Juice
{
	public void eat()
	{
		System.out.println("eating IceCream");
	}
	public void drink()
	{
		System.out.println("Drinking Juice");
	}

	public static void main(String[] args)
	{
		IceCream c = new MastaniQ8();
		c.eat();
		Juice j = new MastaniQ8();
		j.drink();
		

	}

}
