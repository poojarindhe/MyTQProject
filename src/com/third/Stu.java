package com.third;

public class Stu
{
	int id=11;
	public void setId(int id)
	{
		this.id=id;
	}

	public void getId()
	{
	
		System.out.println(" getId method...");
		
	
	}
	public void displayData()
	{
		this.getId();
		//System.out.println(id);
		
	}
	void display()
	{
		int id=22;
		String Str = "Pooja";
		System.out.println(id+" "+Str);
	}
	public static void main(String[] args) 
	{
        Stu ss= new Stu();
        ss.displayData();
        ss.display();
	}

}
