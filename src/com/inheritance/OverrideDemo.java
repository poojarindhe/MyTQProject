package com.inheritance;
class Animal2
{  
void eat()
    {
	System.out.println("eating...");
	}  
}  
class Dog2 extends Animal2
{  
@Override
void eat()
    {
	System.out.println("barking...");
	}  
}  
class Cat extends Animal2
{ 
@Override
void eat()
    {
	System.out.println("meowing...");
	}  
}  
public class OverrideDemo
{  
public static void main(String args[])
{ 
	Animal2 aa=new Dog2();
	aa.eat();
	

}
}
