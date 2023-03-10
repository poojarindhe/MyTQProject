package com.inheritance;
class Shape{
	public void display()
	{
		System.out.println("Inside display");
	}
}
class Rectangle extends Shape{
	public void area()
	{
		System.out.println("Inside area");
	}
}
class Cube extends Rectangle{
	public void volume()
	{
		System.out.println("Inside volume");
	}
}

public class Test {

	public static void main(String[] args) 
	{
      Cube c = new Cube();
      c.display();
      c.area();
      c.volume();
	}

}