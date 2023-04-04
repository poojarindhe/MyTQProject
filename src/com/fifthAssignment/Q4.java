package com.fifthAssignment;

class Parent
{
	 public void display() 
	 {
	     System.out.println("This is parent class");
	 }
}
	class Child extends Parent 
	{
	 public void view() 
	 {
	     System.out.println("This is child class");
	 }
}
	public class Q4 
	{

		public static void main(String[] args)
		{
			
			Parent parentObj = new Parent();
	        parentObj.display();

	        Child childObj = new Child();
	        childObj.view();

	        childObj.display();
	    }
	}
