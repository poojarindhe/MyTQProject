package com.weekendTest6;

class Department
{
	int deptid;
	String deptName;
	
	Department(int id,String deptName)
	{
		this.deptid=id;
		this.deptName=deptName;
	}
	public String toString()
	{
		return deptid+" "+deptName;
	}
}
public class Emp 
{
	int empno;
	String name;
	Department dept;
	
	
	Emp(int id, String name,Department dept)
	{
		this.empno=id;
		this.name=name;
		this.dept=dept;
		System.out.println(id+" "+name+" "+dept);
	}
	
	public String tostring()
	{
		return empno+" "+name+" "+dept;
	}
	
	

	public static void main(String[] args)
	{
		Department d1=new Department(1,"computer");
		Department d2=new Department(2,"IT");
		Department d3=new Department(3,"civil");
		
		
		Emp []e=new Emp[3];
		e[0]=new Emp(101,"Pooja",d1);
		e[1]=new Emp(102,"Monu",d2);
		e[2]=new Emp(103,"Poonam",d3);
		
	
	}

}
