package com.forth;

public class Student 
{
	String name;
	String add;
	int age;
	public void set_info(String n,int a)
	{
		System.out.println("Name :"+n+" "+"Age :"+a );
	}
	public void set_info(String n,String add,int a)
	{
		System.out.println("Name :"+n+" "+"Address :"+add+" "+"Age :"+a);
	}

	public static void main(String[] args)
	{
		Student s= new Student();
		s.set_info("pooja", 25);
	    s.set_info("Monika", "pune", 25);
	}

}
