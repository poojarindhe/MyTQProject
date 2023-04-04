package com.array;

import java.util.Scanner;

public class Emp 
{
	int id;
	String name;
	int salary;
	
	Emp(int i,String n,int s)
	{
		this.id=i;
		this.name=n;
		this.salary=s;
	}
	public String toString()
	{
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) 
	{
		Emp e[]=new Emp[2];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<=e.length-1;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			System.out.println("Enter salary");
			int	 salary=sc.nextInt();
			
			e[i]=new Emp(id,name,salary);
		}	
		
		for(Emp emp : e)
		{   
			if(emp.salary==20000)
			{
				emp.salary =(int) (emp.salary*1.1);
				System.out.println(emp);
		
		    }
		
			
	    }
		
	}

} 
