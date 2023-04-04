package com.containment;

import java.util.Scanner;

public class Paytm {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter expense ");
		int expense=sc.nextInt();
		
		Customer c=new Customer();
		c.setCid(1);;
		c.setCname("Pooja");;
		int currentbalance=c.getBalance();
		int newbal=currentbalance-expense;
		c.setBalance(newbal);
		System.out.println(c.getCid());
		System.out.println(c.getCname());
		System.out.println(c.getBalance());

		

	}

}
