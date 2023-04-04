package com.weekendTest3;
class GrandFather
{
	void show()
	{
		System.out.println(" i am GrandFather");
	}
}
class Father extends GrandFather
{
	void show()
	{
	System.out.println("i am Father");
	}
}
class Daughter extends Father
{
	void show()
	{
		System.out.println("i am daughter");
	}
}

public class MultilevelDemo {

	public static void main(String[] args)
	{
      Daughter d= new Daughter();
      d.show();
	}

}
