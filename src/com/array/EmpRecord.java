package com.array;

public class EmpRecord 
{
	int  id;
	String name;
	String dept;
	int salary;
	String add;
	int age;
	EmpRecord emp[];
	int count=0;
	
	EmpRecord()
	{
		
	}
	
	void createEmp()
	{
		EmpRecord []emp=new EmpRecord[4];
	}
	public EmpRecord(int eid,String name,String dept,int salary,String add,int age)
	{
		this.id=eid;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.add=add;
		this.age=age;
		this.emp=new EmpRecord[4];
		this.count=0;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+salary+" "+add+" "+age;
	}
	
	void insertEmp(int id,String name,String dept,int salary,String add,int age)
	{
		emp[count]=new EmpRecord(id,name,dept,salary,add,age);
		count++;
		//System.out.println(id+" "+name+" "+dept+" "+salary+" "+add+" "+age);
		
	}
	void showEmpRecord()
	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+add+" "+age);
		
		 
	}
	void updateRecord()
	{
		
	}
	void deleteRecord()
	{
		
	}
	
	
	

	public static void main(String[] args)
	{
		
		EmpRecord e2=new EmpRecord();
		e2.insertEmp(101, "Pooja", "computer", 500000, "Buldana", 25);
		e2.insertEmp(102,"Santosh","electronics",1000000,"pune",30);
		e2.insertEmp(103,"Monika","civil",800000,"Mumbai",24);
		e2.insertEmp(104,"Neha","IT",400000,"Satara",28);
		
		e2.createEmp();
		
		

	}

}
