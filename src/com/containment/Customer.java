package com.containment;

public class Customer 
  {
	private int cid;
	private String cname;
	private int balance=10000;
	


	public int getCid() 
	{
		return cid;
	}

	public void setCid(int cid) 
	{
		this.cid = cid;
	}

	public String getCname() 
	{
		return cname;
	}

	public void setCname(String cname) 
	{
		this.cname = cname;
	}

	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public String toString()
	{
		return cid+" "+cname+" "+balance;
		
	}

}
