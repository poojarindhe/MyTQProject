package com.third;

public class Emp 
{
	private int id;
	private String name;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) 
	{
    Emp e=new Emp();
    e.setId(11);
    e.setName("Pooja");
    System.out.println(e.getId()+" "+e.getName());
	}

}
