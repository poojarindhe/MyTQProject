package com.weekendTest3;

import java.util.Scanner;

public class NatinalGame {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter country name :");
		String str=sc.next();
		
		switch(str)
		{
		case ("india") :
			System.out.println("Hockey");
			break;
		case ("china"):
			System.out.println("Table Tennis");
			break;
		case ("Bangladesh"):
			System.out.println("Kabaddi");
		     break;
		case("Italy"):
			System.out.println("Football");
		    break;
		case("US"):
			System.out.println("Baseball");
	     	break;
		default:
		
			System.out.println(" not in list");
		
		}
	}

}
