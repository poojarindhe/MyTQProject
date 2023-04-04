 package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentwithMarks 
{
	int id;
	String name;
	int marks[];
	
	StudentwithMarks(int i,String n,int m[])
	{
		this.id=i;
		this.name=n;
		this.marks=m;
	}
	public String toString()
	{
		return id+" "+name+" "+Arrays.toString(marks);
	}

	public static void main(String[] args) 
	{
		StudentwithMarks s[]= new StudentwithMarks[2];
	
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
		System.out.println("Enter id :");
		int id=sc.nextInt();
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter the Marks");
		
		
		int m[]=new int[3];
		for(int j=0;j<m.length;j++)
		{
			 
		m[j]=sc.nextInt();
			
        }
		 
		
		s[i]=new StudentwithMarks(id,name,m);
	}
		for(StudentwithMarks sm : s)
		{
			int p[]=sm.marks;
			int sum=0;
			for(int i=0;i<p.length;i++)
			{
				sum=sum+p[i];
			}
			int per=sum/p.length;
			if(per>60) 
			{
				System.out.println(sm+"    per="+per);
			}
		}

	}
}
