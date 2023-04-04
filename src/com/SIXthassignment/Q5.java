package com.SIXthassignment;


class Animal
{
	public final void eat()
	{
		System.out.println(" animal is eating friuts :");
	}
}
class Dog extends Animal
{
	//@override
	//public final void eat()
	{
		//final method can not be override
	}
}
public class Q5 {

	public static void main(String[] args)
	{
		Animal a = new Animal();

	}

}
