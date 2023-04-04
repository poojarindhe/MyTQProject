package com.forth;

public class Cycle
{
	int account_no;
	int noOfWheels;
	
	Cycle()
	{
		
		System.out.println("I am default constructor....");
	}
	Cycle(int ac_no,int nowheels)
	{
		this();
		System.out.println("i am another constructor....");
	}

	public static void main(String[] args)
	{
		//Cycle c= new Cycle();
		Cycle cc=new Cycle(67245618,4);
		//System.out.println(cc.account_no+" "+cc.noOfWheels);
		
		

	}

}
