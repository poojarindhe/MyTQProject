package com.array;

import java.util.Scanner;

class Stu
{
	int sid;
	String name;
	String add;
	
	Stu(int i,String sn,String a)
	{
		this.sid=i;
		this.name=sn;
		this.add=a;
	}
	public String toString()
	{
		return sid+" "+name+" "+add; 
	}
}
public class Course 
{
	int id;
	String name;
	int fees;
	Stu s;
	
	Course(int id,String name,int fees,Stu s)
	{
		this.id=id;
		this.name=name;
		this.fees=fees;
		this.s=s;
	}
	public String toString()
	{
		return id+" "+name+" "+fees+" "+s;
	}

	public static void main(String[] args)
	{
		Stu s1= new Stu(11,"Pooja","Buldana");
		Stu s2= new Stu(22,"Monika","pune");     
		Course c[]=new Course[2];
		c[0]=new Course(101,"computer",30000,s1);
		c[1]=new Course(102,"python",20000,s2);
		
		
		for(Course result : c)
		{
			System.out.println(result);
		}
       
       
      }

}
