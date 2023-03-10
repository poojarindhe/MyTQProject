package com.firstday;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args)
	{
		double P,T,R,si;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of P ,T, R");//principal amount,rate,time
		P=sc.nextDouble();
		T=sc.nextDouble();
		R=sc.nextDouble();
		
		si=(P*T*R)/100;
		System.out.println("simple intrest is :"+si);
		
	}

}
