package com.checkcondition;

import java.util.Scanner;

public class TernaryOpDemo1 
{    // to check number is less than 100 and greater than 50;
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		String Result=(num>=50 && num<=100)?"Number in between 50 to 100":"Invalid_Number"; 
		System.out.println(Result);
	}

}
