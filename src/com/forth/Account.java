package com.forth;

public class Account 
{
	long account_no=83618366838l;
	String cust_name="Pooja Mohite";
	long acc_no;
	String name;

	/*
	 * Account() { System.out.println("I am default constructor...."); }
	 */
	Account(long ac_no,String c_name)
	{
		this.account_no=ac_no;
		this.cust_name=c_name;
		System.out.println("I am Parameterized constructor....");
	}
	public String toString()
	{
		return account_no+" "+cust_name;
	}

	public static void main(String[] args) 
	{
		
	  //Account aa= new Account();
	  Account a= new Account(782377889177l,"Monika");
	  Account b=new Account(67328726398l,"Neha");
	
	 System.out.println(a.account_no+" "+a.cust_name);
	 System.out.println(b.account_no+" "+b.cust_name);
	 
	 System.out.println("Account_No :"+a.acc_no);
	 System.out.println("customer_Name :"+a.name);
	  

	}

}
