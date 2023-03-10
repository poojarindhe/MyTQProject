package com.inheritance;

//public final class FinalDemo 
public class FinalDemo
{
	static final int x;
	static
	{
		x=55;
	}
	//final int x;//blank final variable
		
	/*
	 * FinalDemo() 
	 * { // x=20;//final keyword not reinitialize;
	 *  }
	 */
	final  void display()
	  {
		  System.out.println(x);
	  }
//class Car extends FinalDemo//final class can not inherited;
		/*
		 * class Car extends FinalDemo { void display() { //final method cannot be
		 * override; }
		 */

	public static void main(String[] args)
	{
		FinalDemo d=new FinalDemo();
		System.out.println(d.x);
		d.display();
		System.out.println(d.x);
		

	}

}
