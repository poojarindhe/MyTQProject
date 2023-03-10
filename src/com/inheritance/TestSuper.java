package com.inheritance;
class Vehical
{
	int wheels=2;
	void run()
	{
	System.out.println(" vehical is running..."+this.wheels);
	}
	
}
class Car extends Vehical
{
	int wheels=4;
	void showCar()
	{
		System.out.println("car is running"+super.wheels);
		super.run();
	}
}
public class TestSuper {

	public static void main(String[] args) 
	{
       Car c=new Car();
       c.showCar();
	}

}
