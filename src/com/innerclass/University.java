package com.innerclass;

public class University 
{
	int x=10000;
	int a=50000;
	
	class College
	{
		int x=100;
		void show()
		{
			int x=10;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(University.this.x);
		}
		
	}
class Department
	{
		int a=50;
		
		void display()
		{
			int a=500;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(University.this.a);
			
		}
	}

	public static void main(String[] args) 
	{
		University u= new University();
		University.College col=u.new College();
		col.show();
		University.Department d=u.new Department();
		d.display();
		
	

	}

}
