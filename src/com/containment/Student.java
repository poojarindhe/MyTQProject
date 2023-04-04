package com.containment;

import java.util.Arrays;
import java.util.Scanner;

public class Student {


	int id;
	int age;
	String name;
	int marks[];
	
	Student(int i,int age,String n,int m[])
	{
		this.id=i;
		this.age=age;
		this.name=n;
		this.marks=m;
	}
	public String toString()
	{
		return id+" "+age+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) 
	{
		Student s[]= new Student[2];
	
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter id :");
		int id=sc.nextInt();
		System.out.println("Enter age :");
		int age=sc.nextInt();
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter the Marks");
		
		
		int m[]=new int[3];
		for(int j=0;j<m.length;j++)
		{
			 
		m[j]=sc.nextInt();
			
       }
		 
		
		s[i]=new Student(id,age,name,m);
	}
		for(Student sm : s)
		{
			int p[]=sm.marks;
			int Stu_age=sm.age;
			int sum=0;
			for(int i=0;i<p.length;i++)
			{
				sum=sum+p[i];
			}
			int per=sum/p.length;
			if(per>60 && Stu_age<16) 
			{
				System.out.println(sm+" "+per);
			}
		}

	}
}
