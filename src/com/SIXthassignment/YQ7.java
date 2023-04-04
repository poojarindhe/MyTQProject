package com.SIXthassignment;


interface X
{
void methodX();
}
class YQ7 implements X
{
public void methodX()
{
System.out.println("Method X");
}
public static void main(String[] args) 
{
	X obj = new YQ7();
	obj.methodX();
	
}
}