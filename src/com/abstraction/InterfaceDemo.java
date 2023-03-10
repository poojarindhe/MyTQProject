package com.abstraction;

abstract class A{
	int x;
	public abstract void  setNum(int x);
}
interface MyInterface
{
	int y=20;
	
}

class Child extends A implements MyInterface
{
	public void setNum(int x) 
	{
		this.x=x;
	}
	public void addition()
	{
		int sum=this.x+MyInterface.y;
		System.out.println(sum);
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) 
	{
      Child cc= new Child();
      cc.setNum(10);
      cc.addition();
    
	}

}
