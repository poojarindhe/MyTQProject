package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Student 
{
	int id;
	String name;
	Student(int i,String n)
	{
		this.id=i;
		this.name=n;
	}
	public String toString()
	{
		return id+" "+name;
	}

	public static void main(String[] args) 
	{
		Student s[]= new Student[2];
      Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<=s.length;i++)
		{
			System.out.println("Enter id");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			
			
			s[i]=new Student(id,"name");
         }	
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		/*
		 * s[0]=new Student(11,"Pooja"); s[1]=new Student(12,"Santosh");
		 * System.out.println(s[0].id+" "+s[0].name);
		 * System.out.println(s[1].id+" "+s[1].name);
		 */
		for(Student z : s)
		{
			System.out.println(z.id+"   "+z.name);
		}

	} 

}
