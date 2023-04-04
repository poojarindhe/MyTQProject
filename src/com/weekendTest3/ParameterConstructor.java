package com.weekendTest3;
class Emp
{
	public void Emp()
	{
		System.out.println("Defualt constructor.....");
	}
	public void Emp(int id,String name)
	{
		System.out.println(id+" "+name);
	}
	public void Emp(int id,int age)
	{
		System.out.println(id+" "+age);
	}
	
}

public class ParameterConstructor {

	public static void main(String[] args)
	{
        Emp e= new Emp();
       // e.Emp();
        e.Emp(11, "Pooja");
        e.Emp(11, 25);
        
	}

}
