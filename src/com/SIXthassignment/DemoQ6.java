package com.SIXthassignment;

public class DemoQ6 
{
	//final int x;//declaration
    final int x=5;
    
    public final void method()
    {
    	System.out.println("I am final method");
    
    }
}
 class Demochild extends DemoQ6//final class cannot be extends
 {
		/*
		 * public final void method() {
		 *                 //final method can not be override
		 * }
		 */
 
	public static void main(String[] args) 
	{

		//System.out.println(x=12);final value not be change

	}

 }
