package com.third;

public class Account
{
	int acno;
    float balance;
     int r;
     int t;
     float si;
    float amt;
    
    public Account(int a, int b) {
        acno = a;
        balance = b;
    }
    
    public void withdraw(int w) {
        balance -= w;
    }
    
    public void deposit(int d) {
        balance += d;
    }


    
    public void accept(int x, int y) {
        r = x;
        t = y;
        amt = 0;
    }
    
    public void compute() {
        si = (balance * r * t) / 100.0f;
        amt = si + balance;
    }
    
    public void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + si);
        System.out.println("Amount: " + amt);
    }


	public static void main(String[] args) 
	{
        Account a=new Account(654813324, 100000);
        a.withdraw(1000);
        a.deposit(5000);
        a.accept(5, 5);
        a.compute();
        a.display();
	}

}
