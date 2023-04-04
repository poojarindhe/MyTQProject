package com.weekendTest6;


class Programmer
{
	public void workingHours()
	{
		System.out.println("Programmer takes to 8 hrs working");
	}
	
}
public class Employee extends Programmer
{

	public void workingHours()
	{
		System.out.println("Employee takes to 9 hrs working ");
	}
	public static void main(String[] args)
	{
		Programmer p= new Programmer();
		p.workingHours();
		Employee e=new Employee();
		e.workingHours();
		Programmer p1= new Employee();
		p1.workingHours();
		

	}

}
