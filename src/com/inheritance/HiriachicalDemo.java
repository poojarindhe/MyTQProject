package com.inheritance;
class Employee
{
	float salary=50000.00f;
	void display()
	{
		System.out.println("Employee salary");
	}
	
}
class P_emp extends Employee
{
	double hike=2.5;
	void incrementS()
	{
		System.out.println("salary is  "+(salary+(salary*hike)));
		super.display();
	}
}
class T_emp extends Employee
{
	double hike=1.5;
	void incrementS()
	{
		System.out.println("salary is  "+(salary+(salary*hike)));
	}
	
}
public class HiriachicalDemo
{
	public static void main(String[] args) {
      P_emp pp= new P_emp();
      T_emp tt=new T_emp();
     // tt.display();
     // pp.display();
      pp.incrementS();
      tt.incrementS();
       
       
       
       
       
       
	}

}
