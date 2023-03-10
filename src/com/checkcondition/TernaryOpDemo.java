package com.checkcondition;

import java.util.Scanner;

public class TernaryOpDemo {
	public static void main(String args[])
	{
		//to check number is even or odd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num =sc.nextInt();
		
	String result=(num%2==0)?"Even_No":"Odd_No";
	System.out.println(result);
	}

}
