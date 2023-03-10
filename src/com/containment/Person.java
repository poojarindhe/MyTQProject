package com.containment;
class Address
{
	int pincode;
	String city;
	Address(int pincode,String city)
	{
		this.pincode=pincode;
		this.city=city;
	}
	public String toString()
	{
		return pincode+" "+city;
	}
}

public class Person {
	int id;
	String name;
	Address adr;
	Person(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public String toString()
	{
		return id+" "+name+" "+adr;
	}

	public static void main(String[] args) 
	{
		//Address a=new Address(443201,"pune");
		 //Person p=new Person(1,"Pooja",a);
		
       Person p=new Person(1,"Pooja",new Address(443201,"pune"));
        System.out.println(p);
        
	}

}
