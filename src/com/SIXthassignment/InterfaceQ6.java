package com.SIXthassignment;

interface Cake
{
	abstract void  bake();
}
class Strawberry implements Cake
{
	public void bake()
	{
		System.out.println(" Strawberry ");
	}
}
class BlackForest implements Cake
{
	public void bake()
	{
		System.out.println(" BaackForest ");
	}
}


public class InterfaceQ6 {

	public static void main(String[] args)
	{
		
		Cake c1 = new Strawberry();
		c1.bake();
		Cake c2= new BlackForest();
		c2.bake();

	}

}
