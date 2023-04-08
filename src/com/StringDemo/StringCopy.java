package com.StringDemo;

import java.util.Scanner;

public class StringCopy {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String oriString,copyString;
		System.out.println("Enter the string :");
		oriString=sc.nextLine()
;
		copyString=oriString;
		System.out.println("Original string :"+oriString);
		System.out.println("Copy string :"+copyString);
		
		String copyString1=String.valueOf(oriString);
		System.out.println(copyString1);//using valueof method...
		
		
	}

}
