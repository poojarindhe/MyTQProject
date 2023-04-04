package com.innerclass;

abstract class vehical
{
	
	
	  vehical(int a)
	  { 
		  System.out.println(a);
	  }
	
	 
	abstract void show();

}
class Bike 
{
	public static void main(String[] args) 
	{
		vehical v = new vehical(10)
			    {
			public void show()
			{
				System.out.println(" my bike");
			}
			
				};v.show();
				
		
		
	}
}
 