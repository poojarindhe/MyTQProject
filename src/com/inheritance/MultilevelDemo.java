package com.inheritance;
class GrandFather
{
  void display()
  {
 System.out.println("I am GrandFather");
   }
}
class Father extends GrandFather
{
	void show()
	{
		System.out.println("I am Father");
	}
}
class Son extends Father
{
	void accept()
	{
		System.out.println("I am Son ");
	}
}
public class MultilevelDemo {

	public static void main(String[] args)
	{
		Son s= new Son();
		s.display();
		s.show();
		s.accept();
		

	}

}
