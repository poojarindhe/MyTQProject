package com.weekendTest6;
class SubCourse
{
	int subid;
	String subName;
	SubCourse()
	{
		System.out.println("I am SubCourse default constructor");
		
	}
}
public class Course
{
	int id;
	String name;
	SubCourse sub;
	
	Course()
	{
		System.out.println("I am Course default constructor");
	}
	

	public static void main(String[] args) 
	{
		
		SubCourse s=new SubCourse();
		Course c1=new Course();
		

	}

}
