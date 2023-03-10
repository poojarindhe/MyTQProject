package com.containment;
class Nib
{
	String typ;
	int pri;
	
 public  Nib(String type,int price)
	{
		this.typ=type;
		this.pri=price;
	}
	public String toString()
	{
		return typ+" "+pri;
	}
}
class Pen
{
	String name;
	String color;
	String type;
	Nib n;
	public  Pen(String name,String color,String type,Nib n)
	{
		this.name=name;
		this.color=color;
		this.type=type;
		this.n=n;
	}
	public String toString()
	{
	return name+" "+color+" "+type+" "+n;	
	}
}
public class Bag 
{
	int bid;
	String colour;
	int price;
	Pen p;
    public  Bag(int bid,String colour,int price,Pen p)
	{
		this.bid=bid;
		this.colour=colour;
		this.price=price;
		this.p=p;
	}
		public String toString()
		{
			return bid+" "+colour+" "+price+" "+p;
		}
	

	public static void main(String[] args)
	{
		Pen pp=new Pen("fountain","blue","gel",new Nib("broad",50));
		Bag b=new Bag(11,"Red",50,pp);
		System.out.println(b);
    
	}

}
